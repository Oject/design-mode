行为型模式

组成
    subject：主题，被观察者, 保存所有被观察者的对象，有添加，删除，通知。。。的行为
    observer：观察者，有个收到通知更新行为， 
        两种方式：1、状态通过参数传入，2、带一个被观察者的实例   本例子是2
    

应用场景
    一个对象状态改变需要通知其他对象，依赖的对象都得到通知
    