#sql�﷨
###[mysql��������](http://www.w3school.com.cn/sql/sql_datatypes.asp)
##SQL Լ��
####NOT NULL �ǿ�Լ��
	NOT NULL Լ��ǿ���в����� NULL ֵ��
		ʵ��:
			CREATE TABLE Persons
			(
			Id_P int NOT NULL,
			LastName varchar(255) NOT NULL,
			FirstName varchar(255),
			Address varchar(255),
			City varchar(255)
			)
####UNIQUE ΨһԼ��
	UNIQUE Լ��Ψһ��ʶ���ݿ���е�ÿ����¼��
	UNIQUE �� PRIMARY KEY Լ����Ϊ�л��м����ṩ��Ψһ�Եı�֤��
	PRIMARY KEY ӵ���Զ������ UNIQUE Լ����
		ʵ��:
			MySQL:
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				UNIQUE (Id_P)
				)
			�����Ҫ���� UNIQUE Լ�����Լ�Ϊ����ж��� UNIQUE Լ��:
			CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				CONSTRAINT uc_PersonID UNIQUE (Id_P,LastName)
				)
			�����ѱ�����ʱ�������� "Id_P" �д��� UNIQUE Լ����
				ALTER TABLE Persons
				ADD UNIQUE (Id_P)
			���� UNIQUE Լ��:
			MySQL:
				ALTER TABLE Persons
				DROP INDEX uc_PersonID
####PRIMARY KEY ����Լ��
		ʵ��:
			MySQL:
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				PRIMARY KEY (Id_P)
				)
			��������:
				ALTER TABLE Persons
				ADD PRIMARY KEY (Id_P)
			ɾ������:
			MySQL:
				ALTER TABLE Persons
				DROP PRIMARY KEY
####FOREIGN KEY ���Լ��
	һ�����е� FOREIGN KEY ָ����һ�����е� PRIMARY KEY��
		ʵ��:
			����� SQL �� "Orders" ����ʱΪ "Id_P" �д��� FOREIGN KEY��
			MySQL:
				CREATE TABLE Orders
				(
				Id_O int NOT NULL,
				OrderNo int NOT NULL,
				Id_P int,
				PRIMARY KEY (Id_O),
				FOREIGN KEY (Id_P) REFERENCES Persons(Id_P)
				)
			����� "Orders" ���Ѵ��ڵ������Ϊ "Id_P" �д��� FOREIGN KEY Լ������ʹ������� SQL��
				MySQL / SQL Server / Oracle / MS Access:
				ALTER TABLE Orders
				ADD FOREIGN KEY (Id_P)
				REFERENCES Persons(Id_P)
			���� FOREIGN KEY Լ������
				MySQL:
				ALTER TABLE Orders
				DROP FOREIGN KEY fk_PerOrders
####CHECK ����Լ��
	CHECK Լ�������������е�ֵ�ķ�Χ��
		ʵ��:
			����� SQL �� "Persons" ����ʱΪ "Id_P" �д��� CHECK Լ����CHECK Լ���涨 "Id_P" �б���ֻ�������� 0 ��������
			My SQL:
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				CHECK (Id_P>0)
				)
			�����Ҫ���� CHECK Լ�����Լ�Ϊ����ж��� CHECK Լ������ʹ������� SQL �﷨��
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				CONSTRAINT chk_Person CHECK (Id_P>0 AND City='Sandnes')
				)
			����ڱ��Ѵ��ڵ������Ϊ "Id_P" �д��� CHECK Լ������ʹ������� SQL��
			ALTER TABLE Persons
			ADD CHECK (Id_P>0)
			���� CHECK Լ��:
				ALTER TABLE Persons
				DROP CHECK chk_Person
####DEFAULT Ĭ��ֵԼ��
		ʵ��:
			�� "Persons" ����ʱΪ "City" �д��� DEFAULT Լ����
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255) DEFAULT 'Sandnes'
				)
			ͨ��ʹ������ GETDATE() �����ĺ�����DEFAULT Լ��Ҳ�������ڲ���ϵͳֵ��
				CREATE TABLE Orders
				(
				Id_O int NOT NULL,
				OrderNo int NOT NULL,
				Id_P int,
				OrderDate date DEFAULT GETDATE()
				)
			����ڱ��Ѵ��ڵ������Ϊ "City" �д��� DEFAULT Լ������ʹ������� SQL��
			MySQL:
				ALTER TABLE Persons
				ALTER City SET DEFAULT 'SANDNES'
			���� DEFAULT Լ��
			���賷�� DEFAULT Լ������ʹ������� SQL��
			MySQL:
				ALTER TABLE Persons
				ALTER City DROP DEFAULT
##SQL�������
####select
				�﷨:SELECT ������ FROM ������
	�ؼ���: DISTINCT : ���ڷ���Ψһ��ͬ��ֵ
				�﷨:SELECT DISTINCT ������ FROM ������
####where:
				�﷨:SELECT ������ FROM ������ WHERE �� ����� ֵ
	LIKE   ����ĳ��ģʽ
	BETWEEN	��ĳ����Χ��
####ORDER BY �Ӿ�:
	���ڸ���ָ�����жԽ������ĸ������˳���������
	ʹ�� DESC �ؼ���,���Խ���
	
				�﷨:SELECT ������, ������ FROM ������ ORDER BY ������ DESC
####insert
	���������в����µ���
				�﷨:INSERT INTO  ������  (��1, ��2,...) VALUES (ֵ1, ֵ2,....)
####update
	�����޸ı��е����ݡ�
				�﷨��UPDATE ������ SET ������ = ��ֵ WHERE ������ = ĳֵ
####delete
	����ɾ�����е���
				�﷨:DELETE FROM ������ WHERE ������ = ֵ
	ɾ��������:
	�����ڲ�ɾ����������ɾ�����е��С�����ζ�ű�Ľṹ�����Ժ��������������ģ�
				�﷨:DELETE FROM table_name���ߣ�DELETE * FROM table_name
##SQL�߼����		
####top
	���ڹ涨Ҫ���صļ�¼����Ŀ
				MySQL �﷨:SELECT column_name(s)
						  FROM table_name
						  LIMIT number
####like
	������ WHERE �Ӿ����������е�ָ��ģʽ
				�﷨:SELECT column_name(s)
					FROM table_name
					WHERE column_name LIKE pattern
		����:������� "Persons" ����ѡȡ��ס�ڰ���"lon"�ĳ��������
			SELECT * FROM Persons
			WHERE City LIKE '%lon%'
				"%" �����ڶ���ͨ�����ģʽ��ȱ�ٵ���ĸ��
	NOT like ����ѡȡ������
#### ͨ���
	���������ݿ��е�����ʱ��SQL ͨ����������һ�������ַ���
	SQL ͨ��������� LIKE �����һ��ʹ��
	%	���һ�������ַ�
	_	�����һ���ַ�
	[charlist]	�ַ����е��κε�һ�ַ�
	[^charlist]����[!charlist] �����ַ����е��κε�һ�ַ�
		����:������� "Persons" ����ѡȡ��ס�ĳ����� "A" �� "L" �� "N" ��ͷ���ˣ�
			SELECT * FROM Persons
			WHERE City LIKE '[ALN]%'
####BETWEEN 
	������ BETWEEN ... AND ��ѡȡ��������ֵ֮������ݷ�Χ����Щֵ��������ֵ���ı��������ڡ�
				�﷨:SELECT column_name(s)
					FROM table_name
					WHERE column_name
					BETWEEN value1 AND value2
		����:����ĸ˳����ʾ���� "Adams"���������� "Carter"����������֮�����
			SELECT * FROM Persons
			WHERE LastName
			BETWEEN 'Adams' AND 'Carter'
#### Alias
	����Ϊ�����ƺͱ�����ָ��������Alias��
				��� SQL Alias �﷨:
							SELECT column_name(s)
							FROM table_name
							AS alias_name
				�е� SQL Alias �﷨:
							SELECT column_name AS alias_name
							FROM table_name
		����: 
				SELECT po.OrderID, p.LastName, p.FirstName
				FROM Persons AS p, Product_Orders AS po
				WHERE p.LastName='Adams' AND p.FirstName='John'
			��ʹ�ñ����� SELECT ��䣺
				SELECT Product_Orders.OrderID, Persons.LastName, Persons.FirstName
				FROM Persons, Product_Orders
				WHERE Persons.LastName='Adams' AND Persons.FirstName='John'
#### join
	���ڸ��������������е���֮��Ĺ�ϵ������Щ���в�ѯ���ݡ�
	INNER JOIN ������
	�ڱ��д�������һ��ƥ��ʱ��INNER JOIN �ؼ��ַ����С�
				�﷨:SELECT column_name(s)
					FROM table_name1
					INNER JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
					ע�ͣ�INNER JOIN �� JOIN ����ͬ�ġ�
	left join ������:
	LEFT JOIN �ؼ��ֻ����� (table_name1) ���ﷵ�����е��У���ʹ���ұ� (table_name2) ��û��ƥ����С�
				�﷨:SELECT column_name(s)
					FROM table_name1
					LEFT JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
	RIGHT JOIN ������:
				�﷨:SELECT column_name(s)
					FROM table_name1
					RIGHT JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
	FULL JOIN ȫ����:
	ֻҪ����ĳ�������ƥ�䣬FULL JOIN �ؼ��־ͻ᷵���С�
				�﷨:
					SELECT column_name(s)
					FROM table_name1
					FULL JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
####union
	UNION ���������ںϲ��������� SELECT ���Ľ������
	��ע�⣬UNION �ڲ��� SELECT ������ӵ����ͬ�������С���Ҳ����ӵ�����Ƶ��������͡�ͬʱ��ÿ�� SELECT ����е��е�˳�������ͬ��
				�﷨:
					SELECT column_name(s) FROM table_name1
					UNION
					SELECT column_name(s) FROM table_name2
					ע�ͣ�Ĭ�ϵأ�UNION ������ѡȡ��ͬ��ֵ����������ظ���ֵ����ʹ�� UNION ALL��
					SQL UNION ALL �﷨
					SELECT column_name(s) FROM table_name1
					UNION ALL
					SELECT column_name(s) FROM table_name2
					���⣬UNION ������е��������ǵ��� UNION �е�һ�� SELECT ����е�������
####SELECT INTO
	�����ڴ�����ı��ݸ�����
	SELECT INTO ����һ������ѡȡ���ݣ�Ȼ������ݲ�����һ�����С�
	SELECT INTO ��䳣���ڴ�����ı��ݸ����������ڶԼ�¼���д浵��
				�﷨:
					�����԰����е��в����±�
					SELECT *
					INTO new_table_name [IN externaldatabase] 
					FROM old_tablename
					����ֻ��ϣ�����в����±�
					SELECT column_name(s)
					INTO new_table_name [IN externaldatabase] 
					FROM old_tablename
		ʵ�� - �������ݸ���:
			������ "Persons" ��ı��ݸ�����
				SELECT *
				INTO Persons_backup
				FROM Persons
			IN �Ӿ����������һ�����ݿ��п�����
				SELECT *
				INTO Persons IN 'Backup.mdb'
				FROM Persons
			����ĳЩ�򣬿����� SELECT �����г���Щ��
				SELECT LastName,FirstName
				INTO Persons_backup
				FROM Persons
			���� WHERE �Ӿ�:
			�� "Persons" ������ȡ��ס�� "Beijing" ���˵���Ϣ��������һ�����������е���Ϊ "Persons_backup" �ı�
				SELECT LastName,Firstname
				INTO Persons_backup
				FROM Persons
				WHERE City='Beijing'
			�����ӵı�
			����һ����Ϊ "Persons_Order_Backup" ���±����а����˴� Persons �� Orders ��������ȡ�õ���Ϣ��
				SELECT Persons.LastName,Orders.OrderNo
				INTO Persons_Order_Backup
				FROM Persons
				INNER JOIN Orders
				ON Persons.Id_P=Orders.Id_P
####INDEX ���
	CREATE INDEX ��������ڱ��д���������
	�ڲ���ȡ�����������£�����ʹ���ݿ�Ӧ�ó�����Ը���ز������ݡ�
			 �﷨:
				�ڱ��ϴ���һ���򵥵�����������ʹ���ظ���ֵ��
					CREATE INDEX index_name
					ON table_name (column_name)
					ע�ͣ�"column_name" �涨��Ҫ�������С�
				ɾ������:
				���� MySQL ���﷨:
					ALTER TABLE table_name DROP INDEX index_name
####DROP ���:
		������ǽ�����Ҫ��ȥ���ڵ����ݣ�������ɾ������:
			�﷨:TRUNCATE TABLE ������
####ALTER TABLE ���
		ALTER TABLE ������������еı�����ӡ��޸Ļ�ɾ���С�
			�﷨:
			�����ڱ�������У���ʹ�������﷨:
				ALTER TABLE table_name
				ADD column_name datatype
			Ҫɾ�����е��У���ʹ�������﷨��
				ALTER TABLE table_name 
				DROP COLUMN column_name
			ע�ͣ�ĳЩ���ݿ�ϵͳ���������������ݿ����ɾ���еķ�ʽ (DROP COLUMN column_name)��
			Ҫ�ı�����е��������ͣ���ʹ�������﷨��
				ALTER TABLE table_name
				ALTER COLUMN column_name datatype
####SQL NULL ֵ
		IS NULL �﷨:
				SELECT LastName,FirstName,Address FROM Persons
				WHERE Address IS NULL
		IS NOT NULL �﷨:
				SELECT LastName,FirstName,Address FROM Persons
				WHERE Address IS NOT NULL
##VIEW����ͼ��
	�� SQL �У���ͼ�ǻ��� SQL ���Ľ�����Ŀ��ӻ��ı�
	��ͼ�����к��У�����һ����ʵ�ı���ͼ�е��ֶξ�������һ���������ݿ��е���ʵ�ı��е��ֶΡ����ǿ�������ͼ��� SQL ������WHERE �Լ� JOIN ��䣬����Ҳ�����ύ���ݣ�������Щ������ĳ����һ�ı�
	ע�ͣ����ݿ����ƺͽṹ�����ܵ���ͼ�еĺ�����where �� join ����Ӱ�졣
		�﷨:
			������ͼ:
				CREATE VIEW view_name AS
				SELECT column_name(s)
				FROM table_name
				WHERE condition
			��ѯ��ͼ:
				SELECT * FROM [Current Product List]
			������ͼ
				SQL CREATE OR REPLACE VIEW Syntax
				CREATE OR REPLACE VIEW view_name AS
				SELECT column_name(s)
				FROM table_name
				WHERE condition
		    ������ͼ:
				SQL DROP VIEW Syntax
				DROP VIEW view_name
##Date����
	MySQL Date ����:
		NOW()	���ص�ǰ�����ں�ʱ��
		CURDATE()	���ص�ǰ������
		CURTIME()	���ص�ǰ��ʱ��
		DATE()	��ȡ���ڻ�����/ʱ����ʽ�����ڲ���
		EXTRACT()	��������/ʱ�䰴�ĵ�������
		DATE_ADD()	���������ָ����ʱ����
		DATE_SUB()	�����ڼ�ȥָ����ʱ����
		DATEDIFF()	������������֮�������
		DATE_FORMAT()	�ò�ͬ�ĸ�ʽ��ʾ����/ʱ��
			ʵ��:
				����� SQL ������������ʱ���� (OrderDate) �� "Orders" ��
				CREATE TABLE Orders 
				(
				OrderId int NOT NULL,
				ProductName varchar(50) NOT NULL,
				OrderDate datetime NOT NULL DEFAULT NOW(),
				PRIMARY KEY (OrderId)
				)
				��ע�⣬OrderDate �й涨 NOW() ��ΪĬ��ֵ����Ϊ�������������в�����ʱ����ǰ���ں�ʱ���Զ��������С�
				���ڣ�����ϣ���� "Orders" ���в���һ���¼�¼��
				INSERT INTO Orders (ProductName) VALUES ('Computer')
	

		
	
	
			

