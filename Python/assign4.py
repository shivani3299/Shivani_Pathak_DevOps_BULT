fname = input("Enter file name: ")
fh = open(fname)

for i in fh:
    txt = i.rstrip().upper()
    print(txt)
