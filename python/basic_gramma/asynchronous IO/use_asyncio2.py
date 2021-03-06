#用Task封装两个coroutine:
import threading
import asyncio
@asyncio.coroutine
def hello():
    print('hello 1')
    yield  from asyncio.sleep(1)
    print('hello 2')
loop = asyncio.get_event_loop()
tasks = [hello(),hello()]
loop.run_until_complete(asyncio.wait(tasks))
loop.close()
"""两个coroutine是由同一个线程并发执行的。
如果把asyncio.sleep()换成真正的IO操作，则多个coroutine就可以由一个线程并发执行。"""

"""小结:
asyncio提供了完善的异步IO支持；
异步操作需要在coroutine中通过yield from完成；
多个coroutine可以封装成一组Task然后并发执行。"""