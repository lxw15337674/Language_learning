#获取当前日期和时间
from datetime import datetime
now = datetime.now() # 获取当前datetime,其类型为datetime
print(now)

#获取指定日期和时间
from datetime import  datetime
dt = datetime(2016,11,8,12,12)
print(dt)

#timestamp是指带有时区的时间
"""timestamp = 0 = 1970-1-1 00:00:00 UTC+0:00"""

#str转换为datetime
from datetime import datetime
cday = datetime.strptime('2016-11-8 15:20:30','%Y-%m-%d %H:%M:%S')
print(cday)
"""字符串'%Y-%m-%d %H:%M:%S'规定了日期和时间部分的格式"""
#datetime转换为str
from datetime import datetime
now = datetime.now()
print(now.strftime('%Y %a, %b %d %H:%M'))
print(str(now))

#datetime加减
from datetime import datetime,timedelta
now = datetime.now()
print(now)
print(now+timedelta(days=2,hours=10))


