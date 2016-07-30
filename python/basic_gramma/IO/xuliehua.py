import pickle, json

#序列化
x='i love you'

print(pickle.dumps(x))  # b'\x80\x03X\n\x00\x00\x00i                          love youq\x00.'

f=open('a.txt','wb')
pickle.dump(x,f)
f.close()
with open('a.txt','rb') as ff:
    print(ff.read())    # b'\x80\x03X\n\x00\x00\x00i                         love youq\x00.'

#反序列化:
w=open('a.txt','rb')
d=pickle.loads(w.read())
w.close()
print(d)               #i love you

w2=open('a.txt','rb')
d2=pickle.load(w2)
w2.close()
print(d2)             #i love you

#序列化------python转变json:
xx='i love you guys!'
print(json.dumps(xx))  # teturn a str---"i love you                         guys!"

s=open('t.txt','w')
y=json.dump(xx,s)
s.close()
with open('t.txt','r') as o:
    print(o.read())     #"i love you guys!"

#反序列化-----JSON反序列化为Python对象:
xxx='"Mr.X and Mr.Q"'    #inside simple quotes are                          double quotes!

print(json.loads(xxx))     #Mr.xie and Mr.qi

z=open('b.txt', 'w')
z.write(xxx)
z.close()
with open('b.txt', 'r') as q:
   print(json.load(q))       #Mr.xie and Mr.qi