####自增运算符
	b = ++a等于a=a+1,b=a
	b = a++等于b=a,a=a+1
####逻辑运算符
	&&,& 与   &为判断两个表达式,&&则针对boolean类型进行判断,当第一个表达式为false则不去判断第二个表达式.
	||   或
	!    非
####三元运算符
	条件式?值1:值2
	若条件是的值为true,则整个表达式取值1,否则取值2.
####字符串函数:
	str.trim()忽略前和后空格
	str.equals(String otherstr)比较两个字符串是否相同. str.equalsIgnoreCase(String otherstr)忽略大小写比较
	str.toLowerCase()将字符串转为小写 str.toUpperCase()将字符串转为大写
	str.split(String sign) 根据分隔符对字符串进行拆分 split(String sign,int limit)会限定拆分的次数
	str.format(String format,Object...args)
####format()格式化字符串
		例: String s = String.format("%tc",date)
	1.时间 
		 转换符:说明:实例
		  %tF	"年-月-日"						2008-03-25
		  %tD 	"月/日/年"						03/25/08
		  %tc	全部日期和时间信`息				星期日 九月 25 12:07:28 CST 2016
		  %tr 	"时:分:秒 PM(AM)"(12时制)		03:22:06 下午
		  %tT	"时:分:秒 "(24时制)				15:23:50
		  %tr	"时:分"(24时制)					15:25
	2.常规
		  %b,%B		布尔类型
		  %s,%S		字符串类型
		  %c,%C		字符(char)类型
		  %d		十进制整数
####正则表达式
		.			任意一个字符
		\\d			0-9的任意一个数字
		\\D			任意一个非数字字符
		\\s			空白字符
		\\s			非空白字符
		\\w			可用作标识符的字符
		\\W			不可用于标识符的字符
		\\p{Lower}	小写字母
		\\p{Upper}	大写字母
		\\p{Alpha}	字母
		\\p{Digit}	十进制数字
		\\p{Alnum}	数字或字母字符
		\\p{Punct}	标点符号
		\\p{Blank}	代表空格
		
		[^456]		4,5,6之外的任何字符
		[a-r]		a-r中的任意一个字母
		[a-zA-Z]	任意一个英文字母
		[a-e[g-z]]	a-e,或g-z中的任何一个字母(并运算)
		[a-o&&[def]] 字母d,e,f
		[a-d&&[^dc]] 字母a,d
		
		限定修饰符
		?			0次或1次
		*			0次或多次
		+			1次或多次
		{n} 		正好出现n次
		{n,}		至少出现n次
		{n,m}		出现n-m次
	
			例如:E-mail格式:X@X.com.cn
				\\w+@\\w+(\\.\\w+)*\\.\\w+ 
				\\w匹配任意字符
				符号"+"表示字符可以出现1次或多次
				(\\.\\w+)* 表示形如".com"格式的字符串可以出现0次或多次.
				\\.\\w+    用于匹配E-mail地址中的结尾字符,如".cn"
####数组函数
	需导入import java.utill.Arrays
	1.填充替换数组元素
		fill(int[]a,int value) 将指定的int值分配给int型数组的每个元素
		fill(int[]a,int fromindex,int toindex,int value)将指定的int值分配给int型数组指定范围中的每个元素.填充的范围从fromindex到toindex.
	2.排序
		Arrays.sort(object) 排序算法是根据字典编排顺序排序,因此数字排在字母前面,大写字母排在小写字母前面.
	3.复制数组
		copyOf(arr,int newlength) newlength指复制后的新数组的长度,如果新数组长度大于arr长度,用0填充.
		copyOfRange(arr,int formlndex,int toindex)	
	4.数组查询
		binarySearch()使用二分搜索法(所以必须是通过sort()方法对数组进行排序)来搜索指定数组.如果不存在返回-1或"-"(插入点).插入点是搜索键将要插入数组的那一点.即第一个大于此键的元素索引.
			binarySearch(Object[]a.Object key) a:要搜索的数组 key:要搜索的值
			binarySearch(object[].a,int fromindex,int toindex,object key)
####权限修饰符
	访问报位置			private 	protected		public
	本类				可见		可见			可见
	同包其他类或子类	不可见		可见			可见
	其他包的类或子类	不可见 		不可见			可见
	当声明类时不使用修饰符设置类的权限,则这个类预设为包存取范围,即只有一个包中的类可以调用这个类的成员变量或成员方法.
####静态成员 ,用于全局变量
		例如:static int id
	不能将方法体内的局部变量声明为static
		例如:
			public class example{
				public void method(){
					static int = 0;
				}
			}
	可以用static定义一个静态区域:
			public class example{
				static{
				}
			}
			
	静态方法:	
		例如:public static lol(){
			}	
	在静态方法中不可以使用this关键字.不可以直接调用非静态方法.
####Integer 
		1.Integer.toString(int x)			获取x的十进制表示
				.toBinaryString(int x) 	获取二进制
				.toHexString(int x)	 	获取十六进制
				.toOctalString(int x)	获取数字的八进制
		2.intValue() 以int型返回此Integer对象
		3.常量
			MAX_VALUE:表示int类型可取的最大值,即2**31-1.
			MIN_VALUE:表示最小值,即-2**31
####数字处理
		Math.pow(x,y)		取x的y次方
		Math.max(x,y)		取x,b的最大值
		Math.abs(x)			取x的绝对值
		Math.random()		0到1之间的double型数字
####object类
		getClass().getName(),返回包名.类名
		重载:
			public static int add(int a,int b){};
			如果参数不定长,可以使用:public static int(int...a){};
####final
		static final用于定义常量   static final double a = 3;
		final 类不能被继承         final class FinalClass{}
####try语句
		try...catch...finally
####获取资源文件的URL路径
		java.class.getResource()
###swing 布局
	分为4种:绝对布局,流布局,边界布局,网格布局
####绝对布局步骤:
		1.使用Container.setLayout(null)取消布局管理器
		2.使用Container.setBounds()设置每个组件的大小与位置.
####流布局
		public FlowLayout(int alignment,int horizGap,int vertGap)   
			alignment参数表示使用流布局管理器后组件在每一行的具体摆放位置.LEFT = 0,CENTER = 1,RIGHT = 2
			后两个参数表示水平间隔与垂直间隔.
###集合类
####list接口的两种类
	1.arraylist,实现可变的数组.优点:访问快.缺点:插入或删除速度较慢
	2.Linkedlist,采用链表结构.优点:插入或删除速度快,缺点:访问慢
	例子:List<E> list = new ArrayList<>(); 
			E:代表合法的java数据类型.例如String
####set集合
	set集合不能有重复值.
	1.HashSet,由哈希表支持.不保证Set的迭代顺序,允许null元素
	2.TreeSet,保证迭代,按照自然顺序递增排序.
		TreeSet类增加的方法
			first()  返回第一个元素
			last()	 返回最后一个元素
			comparator() 	返回对此Set中的元素进行排序的比较器.如果此Set使用自然顺序,则返回null
			headSet(E toElement)	返回一个新的Set集合,包含toElement(不包含)之前的对象
			subSet(E fromElement,E fromElement)	包含fromElement(包含)到fromElement(不包含)之间的对象
			tailSet(E fromElement) 包含之后的对象
####Map集合
	提供key到value的映射.map允许value为null
			例:Map<String,String> map = new HashMap<>()
		方法:
			put(key,value) 添加key与value的映射关系
			containsKey(Object key)	如果此映射包含制定key的映射关系,则返回true
			containsKey(Object value) 
			get(object key)  如果存在key,返回对应的值,否则返回null
			keySet()	返回key对象形成的Set集合
			values()	返回所欲值对象形成的Collection集合
		Map接口常用的实现类有HashMap和TreeMap.建议使用HashMap类,因为由HashMap类实现的Map集合添加和删除映射关系效率更高.
			1.HashMap是基于哈希表的Map接口的实现,通过哈希码对其映射关系进行快速查找.允许使用null值和键.但必须保证键的唯一性.此类不保证映射的顺序.
			2.TreeMap:适用于希望Map集合中的对象存在一定的顺序.在添加,删除和定位映射关系时,TreeMap类比HashMao类性能稍差.由于TreeMap类实现的Map集合中的映射关系是根据键对象按照一定的顺序排列的,因此不允许键对象是null.
		可以通过HashMap类创建Map集合,当需要顺序输出时,在创建一个相同的TreeMap类实例.
			treemap.putAll(map); #全部添加对象
##IO
####输入流
	1.read()方法:从输入流中读取数据的下一个字节.返回0-255范围内的int字节值.如果已到流末尾而没有可用的直接.则返回值-1.
	2.read(byte[] b):从输入流中读入一定长度的字节.
	3.mark(int readlimit)方法:在输入流的当前位置放置一个标记,readlimit参数告知允许读取的字节数.
	4.reset()方法:将输入指针返回到当前所处的标记处.
	5.skip(long n)方法:跳过输入流上的n个字节并返回.
	5.markSupported()方法:如果当前流支持mark()/reset()操作就返回true
	6.close方法:关闭并释放此输入流
####输出流
	1.write(int b)方法: 将制定的字节写入此输出流.
	2.write(byte[] b)方法:将b个字节从指定的byte数组写入此输出流.
	3.write(byte[] b,int off,int len)
	4.flush()方法:彻底完成输出并清空缓存区
	5.close()方法:关闭输出流.
###File类
	1.创建路径
		new File(String pathname)
			File file = new File("d:/1.txt");
		New File(String parent,String child)
			parent:父路径字符串.例如,D:/doc
			child:子路径字符串,例如:letter.txt
		New File(File f,String child)
			f:父路径对象,例如,D:/doc/
	2.获取文件信息:
		方法			返回值			说明	
		getName() 		String			获取文件的名称
		canRead()		boolean			判断是否可读
		canWrite() 		boolean
		exits()			boolean			判断文件是否存在
		length() 		long			判断文件的长度
		getAbsolutePath()	String		获取绝对路径
		getParent()		String			获取父路径
		isFile()		boolean			判断文件是否存在
		isDirectory		boolean			判断是否是一个目录
		isHidden()		boolean			判断是否是隐藏文件
		lastModified	long			获取最后修改时间
###文件输入/输出流
	1.FileInputStream与FileOutputStream类
		用来操作磁盘文件.用于需求简单.
	2.FileReader和FileWriter类
		使用第一种类,存在一点不足,即这两个类都只提供了对字节或字节数组的读取方法.由于汉字在文件中占用两个字节,如果使用字节流,读取可能出现乱码现象.
		FileReader流顺序地读取文件,只要不关闭流,每次调用read()方法就顺序地读取源中其余的内容,直到源的末尾或关闭.
	3.带缓存的输入/输出流
		缓存是I/O的一种性能优化.缓存流为I/O流增加内存缓存区.使skip(),mark(),reset()方法成为可能.
		1.BufferedInputStream与BufferedOutputStream类
			BufferedInputStream(InputStream in).
			BufferedInputStream(InputStream in,int size).
			第一种构造方法创建一个带有32字节的缓存流,第二种按指定的大小来创建缓存区.
		2.BufferedReader与BufferedWriter类
	4.ZIP压缩输入/输出流
		zipOutputStream(OutputStream out)
		1.putNextEntry(ZipEntry e) 	  			void 		开始写一个新的zipEntry,并将流内的位置移至此entry所值数据的开头
		2.write(byte[] b,int off,int len)		void		将字节数组写入当前ZIP条目数据
		3.finish()								void 		完成写入内容
		4.setComment(String comment)			void		设置ZIP文件的注释文字
##反射
	通过反射可访问的方法:
	1.
		getPackage()		获取包的存放路径
		getName()			类的名称
		getSuperclass()		类继承的类
		getInterface()		类实现的所有接口
	2.构造方法
		getConstructors()	返回数组	获取所有权限为public的构造方法
		getConstructors(Class<?>...parameterTypes)		获取指定的构造方法
		getDeclaredConstructors()		返回数组		获得所有构造方法,按声明顺序返回
		getDeclaredConstrucotes(Class<?>...parameterTypes)
	3.方法
		getMethods()		返回数组	获取所有权限为public的方法
		getMethods(String name,Class<?>...parameterTypes)
		getDeclaredMethods()	返回数组	获取所有方法,按声明顺序返回
		getDeclaredMethods(String name,Class<?>...parameterTypes)
	4.成员变量
		getFields()			返回数组	获得所有权限为public的成员变量 
		getFields(String name)		获得指定成员变量
		getDeclaredFiedls()	返回数组			获得所有成员变量,按声明顺序返回.
		getDeclaredFiedls(String name)	获得指定成员变量
	5.内部类
		getClasses()		返回数组	获得所有权限为public的内部类
		getDeclaredclasses()	返回数组	获得所有内部类
		getDeclaredclass()		如果该类为内部类,这返回它的成员类,否则返回null    
##枚举
	###枚举类型
		1.枚举类型成员的方法
			枚举类型名称.values()	将枚举类型成员以数组的形式返回
			枚举类型名称.valueOf("abc")		实现将普通字符串转换为枚举实例
			枚举对象.compareTo()	比较两个枚举对象在定义时的顺序  正值代表在对象位置之前,0代表位置相同,负值代表对象位置之后
			枚举对象.oridinal()		得到枚举成员的位置索引
	
		格式:对象 instanceof 类别