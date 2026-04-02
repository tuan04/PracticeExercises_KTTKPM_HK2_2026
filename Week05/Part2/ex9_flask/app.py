from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Chào mừng bạn đến với ứng dụng Flask chạy trong Docker!'

if __name__ == '__main__':
    # host='0.0.0.0' để Docker có thể ánh xạ cổng ra ngoài
    app.run(debug=True, host='0.0.0.0', port=5000)