# Eager vs Lazy Filters

- Literatürde Lazy bir işlemin geç (ötelenmiş) olarak yapıldığını, Eager ise yapılacak işlemin emir verilir verilmez yapıldığını temsil etmek için kullanılır.
 
 ```
 val students=listof("Cansu","Zeynep,"Ozkan","Cemre")
 fun main(){
     println(students.filter{it[0] == 'C'})
 }
 
```

