#sql语法
###[mysql数据类型](http://www.w3school.com.cn/sql/sql_datatypes.asp)
##SQL 约束
####NOT NULL 非空约束
	NOT NULL 约束强制列不接受 NULL 值。
		实例:
			CREATE TABLE Persons
			(
			Id_P int NOT NULL,
			LastName varchar(255) NOT NULL,
			FirstName varchar(255),
			Address varchar(255),
			City varchar(255)
			)
####UNIQUE 唯一约束
	UNIQUE 约束唯一标识数据库表中的每条记录。
	UNIQUE 和 PRIMARY KEY 约束均为列或列集合提供了唯一性的保证。
	PRIMARY KEY 拥有自动定义的 UNIQUE 约束。
		实例:
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
			如果需要命名 UNIQUE 约束，以及为多个列定义 UNIQUE 约束:
			CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				CONSTRAINT uc_PersonID UNIQUE (Id_P,LastName)
				)
			当表已被创建时，如需在 "Id_P" 列创建 UNIQUE 约束：
				ALTER TABLE Persons
				ADD UNIQUE (Id_P)
			撤销 UNIQUE 约束:
			MySQL:
				ALTER TABLE Persons
				DROP INDEX uc_PersonID
####PRIMARY KEY 主键约束
		实例:
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
			设置主键:
				ALTER TABLE Persons
				ADD PRIMARY KEY (Id_P)
			删除主键:
			MySQL:
				ALTER TABLE Persons
				DROP PRIMARY KEY
####FOREIGN KEY 外键约束
	一个表中的 FOREIGN KEY 指向另一个表中的 PRIMARY KEY。
		实例:
			下面的 SQL 在 "Orders" 表创建时为 "Id_P" 列创建 FOREIGN KEY：
			MySQL:
				CREATE TABLE Orders
				(
				Id_O int NOT NULL,
				OrderNo int NOT NULL,
				Id_P int,
				PRIMARY KEY (Id_O),
				FOREIGN KEY (Id_P) REFERENCES Persons(Id_P)
				)
			如果在 "Orders" 表已存在的情况下为 "Id_P" 列创建 FOREIGN KEY 约束，请使用下面的 SQL：
				MySQL / SQL Server / Oracle / MS Access:
				ALTER TABLE Orders
				ADD FOREIGN KEY (Id_P)
				REFERENCES Persons(Id_P)
			撤销 FOREIGN KEY 约束，：
				MySQL:
				ALTER TABLE Orders
				DROP FOREIGN KEY fk_PerOrders
####CHECK 限制约束
	CHECK 约束用于限制列中的值的范围。
		实例:
			下面的 SQL 在 "Persons" 表创建时为 "Id_P" 列创建 CHECK 约束。CHECK 约束规定 "Id_P" 列必须只包含大于 0 的整数。
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
			如果需要命名 CHECK 约束，以及为多个列定义 CHECK 约束，请使用下面的 SQL 语法：
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255),
				CONSTRAINT chk_Person CHECK (Id_P>0 AND City='Sandnes')
				)
			如果在表已存在的情况下为 "Id_P" 列创建 CHECK 约束，请使用下面的 SQL：
			ALTER TABLE Persons
			ADD CHECK (Id_P>0)
			撤销 CHECK 约束:
				ALTER TABLE Persons
				DROP CHECK chk_Person
####DEFAULT 默认值约束
		实例:
			在 "Persons" 表创建时为 "City" 列创建 DEFAULT 约束：
				CREATE TABLE Persons
				(
				Id_P int NOT NULL,
				LastName varchar(255) NOT NULL,
				FirstName varchar(255),
				Address varchar(255),
				City varchar(255) DEFAULT 'Sandnes'
				)
			通过使用类似 GETDATE() 这样的函数，DEFAULT 约束也可以用于插入系统值：
				CREATE TABLE Orders
				(
				Id_O int NOT NULL,
				OrderNo int NOT NULL,
				Id_P int,
				OrderDate date DEFAULT GETDATE()
				)
			如果在表已存在的情况下为 "City" 列创建 DEFAULT 约束，请使用下面的 SQL：
			MySQL:
				ALTER TABLE Persons
				ALTER City SET DEFAULT 'SANDNES'
			撤销 DEFAULT 约束
			如需撤销 DEFAULT 约束，请使用下面的 SQL：
			MySQL:
				ALTER TABLE Persons
				ALTER City DROP DEFAULT
##SQL基本语句
####select
				语法:SELECT 列名称 FROM 表名称
	关键词: DISTINCT : 用于返回唯一不同的值
				语法:SELECT DISTINCT 列名称 FROM 表名称
####where:
				语法:SELECT 列名称 FROM 表名称 WHERE 列 运算符 值
	LIKE   搜索某种模式
	BETWEEN	在某个范围内
####ORDER BY 子句:
	用于根据指定的列对结果以字母或数字顺序进行排序。
	使用 DESC 关键字,可以降序
	
				语法:SELECT 列名称, 列名称 FROM 表名称 ORDER BY 列名称 DESC
####insert
	用于向表格中插入新的行
				语法:INSERT INTO  表名称  (列1, 列2,...) VALUES (值1, 值2,....)
####update
	用于修改表中的数据。
				语法：UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
####delete
	用于删除表中的行
				语法:DELETE FROM 表名称 WHERE 列名称 = 值
	删除所有行:
	可以在不删除表的情况下删除所有的行。这意味着表的结构、属性和索引都是完整的：
				语法:DELETE FROM table_name或者：DELETE * FROM table_name
##SQL高级语句		
####top
	用于规定要返回的记录的数目
				MySQL 语法:SELECT column_name(s)
						  FROM table_name
						  LIMIT number
####like
	用于在 WHERE 子句中搜索列中的指定模式
				语法:SELECT column_name(s)
					FROM table_name
					WHERE column_name LIKE pattern
		例子:从上面的 "Persons" 表中选取居住在包含"lon"的城市里的人
			SELECT * FROM Persons
			WHERE City LIKE '%lon%'
				"%" 可用于定义通配符（模式中缺少的字母）
	NOT like 可以选取不包含
#### 通配符
	在搜索数据库中的数据时，SQL 通配符可以替代一个或多个字符。
	SQL 通配符必须与 LIKE 运算符一起使用
	%	替代一个或多个字符
	_	仅替代一个字符
	[charlist]	字符列中的任何单一字符
	[^charlist]或者[!charlist] 不在字符列中的任何单一字符
		例子:从上面的 "Persons" 表中选取居住的城市以 "A" 或 "L" 或 "N" 开头的人：
			SELECT * FROM Persons
			WHERE City LIKE '[ALN]%'
####BETWEEN 
	操作符 BETWEEN ... AND 会选取介于两个值之间的数据范围。这些值可以是数值、文本或者日期。
				语法:SELECT column_name(s)
					FROM table_name
					WHERE column_name
					BETWEEN value1 AND value2
		例子:以字母顺序显示介于 "Adams"（包括）和 "Carter"（不包括）之间的人
			SELECT * FROM Persons
			WHERE LastName
			BETWEEN 'Adams' AND 'Carter'
#### Alias
	可以为列名称和表名称指定别名（Alias）
				表的 SQL Alias 语法:
							SELECT column_name(s)
							FROM table_name
							AS alias_name
				列的 SQL Alias 语法:
							SELECT column_name AS alias_name
							FROM table_name
		例子: 
				SELECT po.OrderID, p.LastName, p.FirstName
				FROM Persons AS p, Product_Orders AS po
				WHERE p.LastName='Adams' AND p.FirstName='John'
			不使用别名的 SELECT 语句：
				SELECT Product_Orders.OrderID, Persons.LastName, Persons.FirstName
				FROM Persons, Product_Orders
				WHERE Persons.LastName='Adams' AND Persons.FirstName='John'
#### join
	用于根据两个或多个表中的列之间的关系，从这些表中查询数据。
	INNER JOIN 内连接
	在表中存在至少一个匹配时，INNER JOIN 关键字返回行。
				语法:SELECT column_name(s)
					FROM table_name1
					INNER JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
					注释：INNER JOIN 与 JOIN 是相同的。
	left join 左连接:
	LEFT JOIN 关键字会从左表 (table_name1) 那里返回所有的行，即使在右表 (table_name2) 中没有匹配的行。
				语法:SELECT column_name(s)
					FROM table_name1
					LEFT JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
	RIGHT JOIN 右连接:
				语法:SELECT column_name(s)
					FROM table_name1
					RIGHT JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
	FULL JOIN 全连接:
	只要其中某个表存在匹配，FULL JOIN 关键字就会返回行。
				语法:
					SELECT column_name(s)
					FROM table_name1
					FULL JOIN table_name2 
					ON table_name1.column_name=table_name2.column_name
####union
	UNION 操作符用于合并两个或多个 SELECT 语句的结果集。
	请注意，UNION 内部的 SELECT 语句必须拥有相同数量的列。列也必须拥有相似的数据类型。同时，每条 SELECT 语句中的列的顺序必须相同。
				语法:
					SELECT column_name(s) FROM table_name1
					UNION
					SELECT column_name(s) FROM table_name2
					注释：默认地，UNION 操作符选取不同的值。如果允许重复的值，请使用 UNION ALL。
					SQL UNION ALL 语法
					SELECT column_name(s) FROM table_name1
					UNION ALL
					SELECT column_name(s) FROM table_name2
					另外，UNION 结果集中的列名总是等于 UNION 中第一个 SELECT 语句中的列名。
####SELECT INTO
	可用于创建表的备份复件。
	SELECT INTO 语句从一个表中选取数据，然后把数据插入另一个表中。
	SELECT INTO 语句常用于创建表的备份复件或者用于对记录进行存档。
				语法:
					您可以把所有的列插入新表：
					SELECT *
					INTO new_table_name [IN externaldatabase] 
					FROM old_tablename
					或者只把希望的列插入新表：
					SELECT column_name(s)
					INTO new_table_name [IN externaldatabase] 
					FROM old_tablename
		实例 - 制作备份复件:
			会制作 "Persons" 表的备份复件：
				SELECT *
				INTO Persons_backup
				FROM Persons
			IN 子句可用于向另一个数据库中拷贝表：
				SELECT *
				INTO Persons IN 'Backup.mdb'
				FROM Persons
			拷贝某些域，可以在 SELECT 语句后列出这些域：
				SELECT LastName,FirstName
				INTO Persons_backup
				FROM Persons
			带有 WHERE 子句:
			从 "Persons" 表中提取居住在 "Beijing" 的人的信息，创建了一个带有两个列的名为 "Persons_backup" 的表：
				SELECT LastName,Firstname
				INTO Persons_backup
				FROM Persons
				WHERE City='Beijing'
			被连接的表
			创建一个名为 "Persons_Order_Backup" 的新表，其中包含了从 Persons 和 Orders 两个表中取得的信息：
				SELECT Persons.LastName,Orders.OrderNo
				INTO Persons_Order_Backup
				FROM Persons
				INNER JOIN Orders
				ON Persons.Id_P=Orders.Id_P
####INDEX 语句
	CREATE INDEX 语句用于在表中创建索引。
	在不读取整个表的情况下，索引使数据库应用程序可以更快地查找数据。
			 语法:
				在表上创建一个简单的索引。允许使用重复的值：
					CREATE INDEX index_name
					ON table_name (column_name)
					注释："column_name" 规定需要索引的列。
				删除索引:
				用于 MySQL 的语法:
					ALTER TABLE table_name DROP INDEX index_name
####DROP 语句:
		如果我们仅仅需要除去表内的数据，但并不删除表本身:
			语法:TRUNCATE TABLE 表名称
####ALTER TABLE 语句
		ALTER TABLE 语句用于在已有的表中添加、修改或删除列。
			语法:
			如需在表中添加列，请使用下列语法:
				ALTER TABLE table_name
				ADD column_name datatype
			要删除表中的列，请使用下列语法：
				ALTER TABLE table_name 
				DROP COLUMN column_name
			注释：某些数据库系统不允许这种在数据库表中删除列的方式 (DROP COLUMN column_name)。
			要改变表中列的数据类型，请使用下列语法：
				ALTER TABLE table_name
				ALTER COLUMN column_name datatype
####SQL NULL 值
		IS NULL 语法:
				SELECT LastName,FirstName,Address FROM Persons
				WHERE Address IS NULL
		IS NOT NULL 语法:
				SELECT LastName,FirstName,Address FROM Persons
				WHERE Address IS NOT NULL
##VIEW（视图）
	在 SQL 中，视图是基于 SQL 语句的结果集的可视化的表。
	视图包含行和列，就像一个真实的表。视图中的字段就是来自一个或多个数据库中的真实的表中的字段。我们可以向视图添加 SQL 函数、WHERE 以及 JOIN 语句，我们也可以提交数据，就像这些来自于某个单一的表。
	注释：数据库的设计和结构不会受到视图中的函数、where 或 join 语句的影响。
		语法:
			创建视图:
				CREATE VIEW view_name AS
				SELECT column_name(s)
				FROM table_name
				WHERE condition
			查询视图:
				SELECT * FROM [Current Product List]
			更新视图
				SQL CREATE OR REPLACE VIEW Syntax
				CREATE OR REPLACE VIEW view_name AS
				SELECT column_name(s)
				FROM table_name
				WHERE condition
		    撤销视图:
				SQL DROP VIEW Syntax
				DROP VIEW view_name
##Date函数
	MySQL Date 函数:
		NOW()	返回当前的日期和时间
		CURDATE()	返回当前的日期
		CURTIME()	返回当前的时间
		DATE()	提取日期或日期/时间表达式的日期部分
		EXTRACT()	返回日期/时间按的单独部分
		DATE_ADD()	给日期添加指定的时间间隔
		DATE_SUB()	从日期减去指定的时间间隔
		DATEDIFF()	返回两个日期之间的天数
		DATE_FORMAT()	用不同的格式显示日期/时间
			实例:
				下面的 SQL 创建带有日期时间列 (OrderDate) 的 "Orders" 表：
				CREATE TABLE Orders 
				(
				OrderId int NOT NULL,
				ProductName varchar(50) NOT NULL,
				OrderDate datetime NOT NULL DEFAULT NOW(),
				PRIMARY KEY (OrderId)
				)
				请注意，OrderDate 列规定 NOW() 作为默认值。作为结果，当您向表中插入行时，当前日期和时间自动插入列中。
				现在，我们希望在 "Orders" 表中插入一条新记录：
				INSERT INTO Orders (ProductName) VALUES ('Computer')
	

		
	
	
			

