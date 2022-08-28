# Eager vs Lazy Filters

### Literatürde Lazy bir işlemin geç (ötelenmiş) olarak yapıldığını, Eager ise yapılacak işlemin emir verilir verilmez yapıldığını temsil etmek için kullanılır.
 
 ```
 val students=listof("Cansu","Zeynep,"Ozkan","Cemre")
 fun main(){
     val eagerList=students.filter{it[0] == 'C'}
     println(eagerList)
 }
 
```

- Bu kod satırını çalıştırdığımızda [Cansu,Cemre] dizisini ekranda görürüz.


 ```
 val students=listof("Cansu","Zeynep,"Ozkan","Cemre")
 fun main(){
     val lazyList=students.asSequence().filter{it[0] == 'C'}
     println(lazyList)
 }
 
```

- Bu kod satırını çalıştırdığımızda ise ekranda diziyi göremeyiz.


```
 val students=listof("Cansu","Zeynep,"Ozkan","Cemre")
 fun main(){
     val lazyList=students.asSequence().filter{it[0] == 'C'}
     println(lazyList.toList())
 }
 
```

- Bu kod satırını çalıştırdığımızda [Cansu,Cemre] dizisini ekranda görürüz.
