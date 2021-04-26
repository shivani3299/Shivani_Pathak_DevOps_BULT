import urllib
from urllib import request
import BeautifulSoup as bs

html=request.urlopen('http://py4e-data.dr-chuck.net/comments_608881.html').read()
li=list()
count=0
x=bs(html,"html.parser")

tags=x('span')
for tag in tags:
    count=count+1
    c=int(tag.contents[0])
    li.append(c)
print('Count',count)
print('Sum',sum(li))
