from flask import Flask, request, make_response, redirect,abort

app = Flask(__name__)


@app.route('/')
def index():
    return '<h1>hello world</h1>'


@app.route('/user/<name>')
def user(name):
    return '<h1>hello,%s!</h1>' % name


@app.route('/request')
def use_request():
    user_agent = request.headers.get('User_Agent')
    return '<p>Your brower is %s</p>' % user_agent


@app.route('/bad')
def Status_code():  # 状态码
    return '<h1>Bad Request</h1>', 400


@app.route('/cookie')
def use_cookie():
    response = make_response('<h1>this is doc a cookie</h1>')
    response.set_cookie('answer', '42')
    return response


@app.route('/redirect')
def use_redirect():
    return redirect('lixiwang.com')

@

if __name__ == '__main__':
    app.run()
