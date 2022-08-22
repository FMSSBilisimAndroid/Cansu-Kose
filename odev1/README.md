# Namespace nedir ?

Bir XML dosyasında, ayırt edici isimlere sahip öğeler ve nitelikleri sağlamak için Namespace kullanılır. Bir XML örneğindeki öğeler veya nitelikler için isimler, farklı XML sözcüklerinden gelebilir. Her bir kelime kendi Namespace'ine verilirse, benzer öğeler veya nitelikler arasındaki belirsizlik ortadan kaldırılabilir.

Tek tip bir kaynağın tanımlayıcısı, bir ad alanı adıdır (URI). Belirli bir XML sözlüğünün ad alanı için kullanılan URI, genellikle yazar veya varlık tarafından kontrol edilen bir kaynağa atıfta bulunur. Ad alanı URI'si yalnızca bir XML ayrıştırıcısı tarafından bir dize olarak işlenir; ad alanı belirtimi, verilere erişmek için kullanılmasını ne zorunlu kılar ne de önerir. Örneğin, “http://schemas.android.com/apk/res/android” adresindeki asıl belgede kod yoktur. Sadece insan okuyucuları android ad alanı hakkında bilgilendirir. Bir URI kullanırken farklı ad alanlarının aynı tanımlayıcıyı kullanması daha az olasıdır, bu nedenle URI kullanırız ("android" gibi dizeler yerine "http://schemas.android.com/apk/res/android" gibi)

Bir XML Ad Alanı aşağıdaki öznitelikleri içerir:

Ad alanı: Ön ekin eklendiği bir URI olarak temsil edilen ad alanı adı, ad alanı URI'si olarak bilinir.
Önek: XMLConstants'ın ardından, öznitelik adının parçası olan bir önek gelir.

Yukarıda görebileceğimiz gibi, ad alanı URI'sinin sonuna “android” öneki eklenir. Android'de yeni bir layout dosyası oluşturursak, varsayılan olarak root layout'a “xmlns:android=”http://schemas.android.com/apk/res/android” yazılır. Android'e atıfta bulunacağınız için anahtarlar XML'inizde tanımlanmalıdır. Bu nedenle, kaynaklar anahtarı ad alanıyla ilişkilendirir; bu nedenle, ad alanı her Android XML dosyasında şu şekilde tanımlanır: – “xmlns:android=”http://schemas.android.com/apk/res/android.” Tanımladıktan sonra, aşağıdaki örnekte bahsettiğimiz gibi tuşlara başvurabiliriz.

- android:layout_width

- android:layout_height

- android:textColor

- android:id

- android:layout_gravity

- android:text

- android:textSize
