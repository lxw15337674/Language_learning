#### 1 py的文件名一定不能与包名相同,例如hanshlib.py 需要改为use_hanshlib.py 
#### 2 127.0.0.1是一个特殊的IP地址，表示本机地址 
#### 3 decode的作用是将其他编码的字符串转换成unicode编码，如str1.decode('gb2312')，表示将gb2312编码的字符串str1转换成unicode编码。
#### 4 encode的作用是将unicode编码转换成其他编码的字符串，如str2.encode('gb2312')，表示将unicode编码的字符串str2转换成gb2312编码。 
#### 5 global创建的全局变量并不能在方法使用,如果在方法中使用必须再次global声明变量, 而声明list算是真正的全局变量,而不需要再声明 
#### 6 round(x,y)对浮点数x限制最多y位小数
#### 7 2的28次方 2**38
#### 8 ord()将字母转换成ASCII码,chr()将相对应的ASCII码转化为字母
#### 9 isinstance()用于检查参数类型 返回true,false
#### 10 当形参如*arg时表示传入数组，当形参如**args时表示传入字典。
#### 11 for,while语句中都有else,触发条件为循环正常结束,如果循环内被break跳出,就不执行else.
#### try语句:
	try:
		<语句>
	except <name>：
		<语句>          #如果在try部份引发了名为'name'的异常，则执行这段代码
	else:
		<语句>          #如果没有异常发生，则执行这段代码
	finally:
		<语句> 			#无论如何，最后运行
### 数据类型
	列表List可变 a=[1,2,3]
	元组Tuple 不可变 a=(1,2,3)
		    1.元组的速度比列表更快
			2.元组可作为字典键,列表而不能
		*args表示一个tuple
		**kw表示一个dict
	Dict{}使用键-值存储，具有极快的查找速度
####列表list操作的函数和方法:
		列表操作包含以下函数:
		1、cmp(list1, list2)：比较两个列表的元素 
		2、len(list)：列表元素个数 
		3、max(list)：返回列表元素最大值 
		4、min(list)：返回列表元素最小值 
		5、list(seq)：将元组转换为列表 
		6.enumerate 函数用于遍历序列中的元素以及它们的下标：
				>>> for i,j in enumerate(('a','b','c')):
				 print (i,j)
					0 a
					1 b
					2 c
		列表操作包含以下方法:
		1、list.append(obj)：在列表末尾添加新的对象
		2、list.count(obj)：统计某个元素在列表中出现的次数
		3、list.extend(seq)：在列表末尾一次性追加另一个序列中的多个值（用新列表扩展原来的列表）
		4、list.index(obj)：从列表中找出某个值第一个匹配项的索引位置
		5、list.insert(index, obj)：将对象插入列表
		6、list.pop(obj=list[-1])：移除列表中的一个元素（默认最后一个元素），并且返回该元素的值
		7、list.remove(obj)：移除列表中某个值的第一个匹配项
		8、list.reverse()：反向列表中元素
		9、list.sort([func])：对原列表进行排序
####元组tuple的函数
		1、cmp(tuple1, tuple2)：比较两个元组元素。
		2、len(tuple)：计算元组元素个数。
		3、max(tuple)：返回元组中元素最大值。
		4、min(tuple)：返回元组中元素最小值。
		5、tuple(seq)：将列表转换为元组。
####字典dict的函数和方法:
		1、cmp(dict1, dict2)：比较两个字典元素。
		2、len(dict)：计算字典元素个数，即键的总数。
		3、str(dict)：输出字典可打印的字符串表示。
		4、type(variable)：返回输入的变量类型，如果变量是字典就返回字典类型。
		Python字典包含了以下内置方法：
		1、radiansdict.clear()：删除字典内所有元素
		2、radiansdict.copy()：返回一个字典的浅复制
		3、radiansdict.fromkeys()：创建一个新字典，以序列seq中元素做字典的键，val为字典所有键对应的初始值
		4、radiansdict.get(key, default=None)：返回指定键的值，如果值不在字典中返回default值
		6、radiansdict.items()：以列表返回可遍历的(键, 值) 元组数组
		7、radiansdict.keys()：以列表返回一个字典所有的键
		8、radiansdict.setdefault(key, default=None)：和get()类似, 但如果键不已经存在于字典中，将会添加键并将值设为default
		9、radiansdict.update(dict2)：把字典dict2的键/值对更新到dict里
		10、radiansdict.values()：以列表返回字典中的所有值

