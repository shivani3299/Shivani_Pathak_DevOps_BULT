package first_groovy

String.metaClass.browse {
def handler = [(~/^Mac OS.*/)  : { "open $it".execute() }, (~/^Windows.*/) : { "cmd /C start $it".execute() },
(~/.*/)         : {
//--- assume Unix or Linux                        
def browsers = [ 'firefox'.'chrome' ]
//--- find a browser we know the location of
def browser = browsers.find {
"which $it".execute().waitFor() == 0
}
//--- and run it if one found
if( browser )
"$browser $it".execute()
}
]
def k = handler.find { k, v -> k.matcher( System.properties.'os.name' ).matches() }
k?.value( delegate )
}
"www.google.fr".browse()
