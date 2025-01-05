Java Programlaması 101
Proje: Gibirish
Problem Tanımı
Son birkaç gündür talihsiz olaylar meydana geldi ve IT departmanındaki yeni
stajyer yanlışlıkla bir arka kapı bıraktı. Hackerlar bu durumu fırsat bilerek sis-
teme sızmayı başardılar. Hackerlar, sistemde gibirish bir mesaj bıraktılar, ancak
IT departmanının bunu çözebilmek için yardımınıza ihtiyacı var. Hackerların
bıraktığı mesaj, boşluklar, sayılar ve özel karakterler de dahil olmak üzere her
türlü karakteri içerebilir, ancak içinde 2 önemli kelime bulunmaktadır: ZERO ve
ONE.
Mesajı anlamak için şifreyi çözmeniz gerekiyor. Şifreyi çözmek için birkaç adım
izlemelisiniz:
1. Verilen dizgeden ZERO ve ONE kelimelerinin geçtiği yerleri çıkarın ve bunları
bir diziye yerleştirin.
2. Çıkarılan diziyi yeni bir diziye aşağıdaki kurallara göre aktarın:
• Eğer kelime ZERO ise, onu 0 ile değiştirin.
• Eğer kelime ONE ise, onu 1 ile değiştirin.
3. Önceki adımın çıktısı hala anlamsızdır. Şifreyi çözmeye devam edebilmek
için, ikili sayıları ondalık sayılara çevirin. Her 8 bit bir bayttır.
4. Şimdi elimizdeki ondalık sayıları, ASCII karakterlerine dönüştürmeliyiz.
5. Son olarak, tüm karakterleri birleştirerek final sonucu elde edin.
6. Şifreyi çözmede bayağı yol kat ettik, ancak hala bir sorun var. Kimse leet
dilini bilmiyor! B@MER bilim insanları, leet dilini çözmek için gereken
bazı bilgileri sağladılar. Sadece aşağıdaki karakterleri aramanız yeterli: A,
B, E, G, I, O, Z Ayrıca leet diliyle ilgili daha fazla bilgi sağladılar. Leet
Örneğin, hackerlar tarafından bırakılan ilk mesaj şu şekildedir:
ZEROxpzxcp[zxzcdfONE()=ssdf-0sdf)ZEROsdfjksdkn-9sdwZERO ONE-
ZEROamsmnfghjllseZEROnkjsdfvbakeoZERO
Ve şifreyi çözerken elde ettiğimiz adımlar şunlar olacaktır:
1
arry = {"ZERO", "ONE", "ZERO", "ZERO", "ONE", "ZERO", "ZERO", "ZERO"}
arry = {"0", "1", "0", "0", "1", "0", "0", "0"}
arry = {72}
arry = {'H'}
String result = "H"
Ve son sonuç H olacaktır.
Girdi
İlk ve sadece tek satırda hackerlar tarafından bırakılan karakterler dizisi yer
almaktadır — her türlü karakteri içerebilir, boşluklar, sayılar ve özel karakterler
dahil.
Çıktı
Bir String yazdırın — Hackerlar tarafından bırakılan mesaj.
Örnekler
• Örnek 1
Girdi
ZERO gibirish ONE gibirish ZERO gibirish ZERO
gibirish ONE gibirish ZERO gibirish
ZERO gibirish ZERO
Çıktı
H
2
• Örnek 2
Girdi
ZERO gibirish ONE gibirish ZERO gibirish ZERO
gibirish ONE gibirish ZERO
gibirish ZERO
gibirish ZERO gibirish ZERO gibirish
ZERO gibirish ONE gibirish
ONE gibirish ZERO gibirish
ONE gibirish ZERO gibirish ZERO gibirish ZERO
gibirish ONE gibirish
ZERO gibirish ZERO gibirish ZERO
gibirish ZERO gibirish
ONE gibirish ONE gibirish
ZERO gibirish ONE gibirish
ZERO gibirish ZERO
gibirish
ONE gibirish ZERO
gibirish ONE gibirish ONE gibirish ZERO gibirish
ZERO gibirish ONE
gibirish ONE gibirish ZERO gibirish ZERO
gibirish ONE
gibirish ONE gibirish ZERO
gibirish ONE gibirish ZERO
gibirish ONE gibirish
ZERO gibirish ZERO gibirish ONE
gibirish ZERO gibirish ZERO gibirish ZERO
gibirish ONE gibirish ONE
gibirish ZERO gibirish ONE gibirish ZERO
gibirish ONE
Çıktı
HACKER5
Not
gibirish yerine yazılan metin \n hariç herhangi bir metin olabilir ve her türlü
karakteri içerebilir, boşluklar, sayılar ve özel karakterler dahil.
Not 2
Kodunuz, MOSS sistemi (yazılım benzerliği ölçümü) ile test edilecek ve intihal
ve yapay zeka (ChatGPT dahil) kullanımı açısından kontrol edilecektir. Girdi
ve çıktı formatına dikkat edin. Girdi ve çıktı formatı tam olarak örnekteki gibi
olmalıdır. Aksi takdirde yanlış cevap alırsınız ve puan kaybedersiniz. Bir Online
3
Judge (Bağlantı) kodunuzu puanlayacaktır, kodda yer alan herhangi bir hard-
coded örnek sistem tarafından görmezden gelinecektir. Kodunuz farklı testlerle
çalışabilecek şekilde yazılmalıdır. Dosya formatı ÖğrenciID_Proje.java ol-
malıdır, burada ÖğrenciID, Biruni Üniversitesi Öğrenci Numaranızdır. Eğer
dosya formatı farklıysa sistem kodu değerlendiremeyecektir. Kodunuz, 10 farklı
testle puanlanacak ve her bir test 10 puan değerindedir. Toplamda 100 puan
alabileceksiniz.
• Eğer kodunuz çalışmazsa 0 puan alırsınız. Bu yüzden kodunuzun çalıştığın-
dan emin olun.
• Eğer kodunuz doğru sonuç vermezse 0 puan alırsınız. Bu yüzden kodunuzun
verilen örnekler için doğru sonucu verdiğinden emin olun.
• Kodunuzda rastgele girilmiş herhangi bir girdi kullanmamalısınız veya girdi
olarak sabit değişkenler tanımlamamalısınız. Kodunuzdan kullanıcıdan
girdi alacak şekilde beklenmektedir.
