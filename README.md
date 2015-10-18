##What is JDic
It's command line tool written in Java to translate Chinese<-> English based on [BaiduAPI][1].

It depends on

 - JDK 1.6+
 - [Jodd-Http][2]
 - [Fastjson][3]

##Get Started

    wget https://github.com/1994/JDic/releases/download/1.0/JDic-1.0.jar
    echo "alias jd='java -jar JDic-1.0.jar'">>~/.bashrc
    
##Base usage
    
    jd<word>
    jd -s <sentence>
    
For example:
  
 - jd test

![](http://7xawrk.com1.z0.glb.clouddn.com/15-10-18/50806598.jpg)
 
 - jd 测试

![](http://7xawrk.com1.z0.glb.clouddn.com/15-10-18/62848779.jpg)


 - jd test 测试

![](http://7xawrk.com1.z0.glb.clouddn.com/15-10-18/3268308.jpg)


 - jd -s Releases are a great way to ship projects on GitHub to your users

![](http://7xawrk.com1.z0.glb.clouddn.com/15-10-18/36765136.jpg)

It works well on Linux,enjoy it :-)


  [1]: http://developer.baidu.com/wiki/index.php?title=%E5%B8%AE%E5%8A%A9%E6%96%87%E6%A1%A3%E9%A6%96%E9%A1%B5/%E7%99%BE%E5%BA%A6%E7%BF%BB%E8%AF%91API
  [2]: https://github.com/oblac/jodd
  [3]: https://github.com/alibaba/fastjson