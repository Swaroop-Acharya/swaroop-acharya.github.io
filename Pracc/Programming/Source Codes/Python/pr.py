import datetime
import mysql
def mysqlconnect():
    conn = mysql.connector(host='localhost', user='root',
                           password="", db="swaroop")
    cur = conn.cursor()
    cur.execute("select @@version")
    output = cur.fetchall()
    print("Connected to database")
    print(output)
    '''
    cur.execute("""CREATE table Hospital (hid varchar(10) primary key,hname varchar(20))""")
    cur.execute("""CREATE table Doctor(did varchar(10) primary key,dname varchar(20),speciality varchar(10),salary int,hid varchar(10),experience varchar(10))""")
    cur.execute("""ALTER TABLE Doctor ADD CONSTRAINT fk FOREIGN KEY(hid) REFERENCES Hospital(hid)""")'''
    cur.execute("Select * from Doctor where did ='D001'")
    res=cur.fetchall()
    print("Doctor with ID D001 :")
    for x in res:
        print(x)
    cur.execute("Select * from Hospital where hid = 'h001'")
    res1 = cur.fetchall()
    print("Hospital with ID H001 : ")
    for x in res1:
        print(x)
    cur.execute("Select * from Doctor where speciality='W' and salary='10000'")
    res1 = cur.fetchall()
    print("Doctors with speciality W and salary 10,000 ")
    for x in res1:
        print(x)
    cur.execute("select * from Doctor A,Hospital B where A.hid= B.hid and B.hname = 'ABC'; ")
    res1 = cur.fetchall()
    print("Doctors working in Hospital ABC : ")
    for x in res1:
        print(x)
    cur.execute("""Update `Doctor` SET `experience` = '10' WHERE `Doctor`.`did` = 'D002'""")
    res1 = cur.fetchall()
    print("Doctor experience for ID D002 updated ")
    for x in res1:
        print(x)
    conn.commit()
    conn.close()
if __name__== "_main_":
    mysqlconnect()