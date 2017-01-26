/**
 * Created by 40417 on 2017/1/26 0026.
 */
//需求:编写一个js文件,自定义一个数组工具对象,需要有找到最大值的方法,与找元素对应的索引值的方法.
function Tool() {
    this.getMax = function (arr) {
        var max = arr[0];
        for (var i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    this.find = function (arr, target) {
        for (var a in arr) {
            if (target == arr[a]) {
                return i;
            }
        }
        return -1;
    }
}

function test() {
    a = [1,2,3,4,5]
    for(var b in a ){
        document.write(a[b])
    }

}

test()
