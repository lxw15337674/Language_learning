"""用asyncio提供的@asyncio.coroutine可以把一个generator标记为coroutine类型，然后在coroutine内部用yield from调用另一个coroutine实现异步操作。
为了简化并更好地标识异步IO，从Python 3.5开始引入了新的语法async和await，可以让coroutine的代码更简洁易读。
请注意，async和await是针对coroutine的新语法，要使用新的语法，只需要做两步简单的替换：
把@asyncio.coroutine替换为async；
把yield from替换为await。"""
#上一节代码
import  asyncio
@asyncio.coroutine
def hello():
    print('Hello 1')
    r = yield from asyncio.sleep(1)
    print("Hello 2")
#新语法
async def hello():
    print('hello 1')
    r = await asyncio.sleep(1)
    print('hello 2')
#剩下的代码保持不变。