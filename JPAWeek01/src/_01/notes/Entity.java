package _01.notes;

public class Entity {

}

// Entity -> varlik anlamina gelmektedir.
// entity -> persistent object -> kalici obje


// Entitylerin ozellikleri 

// 1 ) Persistable
// entity'in durumu (state/instance variable) kaydedilebilir olmali ve snrasinda ulasabilmeliyiz.
// entity siniflarinin ozelligine sahip olmasi gerekiyor. (public no-arg constructor , getter/setter)..

// 2) Identity
// identity -> kimlik anlamina gelmekte.
// her entity'inin bir identifier/kimlik bilgisi olmalidir. primary key olarak ifade edebiliriz.

// 3) Transactionality
// transaction -> turkce karsilik olarak islem

//  transaction kavrami , guvenilir/reliable uygulamalar icin olmazsa olmaz bir kavramdir.
// en temel olarak ; havale islemi yapildigini dusunelim;

// 1)para cikisi oldu
// 2)karsi hesapta para giris olmali.

// para cikisi oldu , bir problem oldu , aynen geriye roll back yapilmasi gereklidir!


// transaction ; 

// Atomicity
// bir yada bir den fazla is parcacigindan/adimdan/islem den olusur.
// butun atomic islemler/adimlar basarili oldugu takdirde transaction basarili olacaktir.
// degilse transaction basarisiz olacaktir.

// consistent
// tutarli .
// 1000TL eft yaptik , karsiya 1000TL gecmesi gerekli!
//

// isolated
// isolate -> yalitmak/ayirmak
//  

// durability
// durable -> dayanikli/kalici

// bir transaction tamamlandiginda sonuc kalici/durable hale gelmelidir. commit
// bir problem varsa roll-back...


 //4) Granularity
// tanecikli olma , ortalama oge boyu gibi anlamlara gelmekte.

// String , Integer , primitive tipler vs bunlar kavramsal olarak entity olamazlar.
// String entinty olmak icin fine-grained/ince tanecikli ozellige sahiptir.
// bunlar entity yerine attribute/ozellik olabilirler.

// enityler  business domain object ozelligi gosterirler.
// uygulamada/projeye ozgu anlami olan . kullanilan siniflarimiz entity ozelligi gosterebilir.

// Employee , Deparment , Project , Address , Company ...

//  An entity is lightweight persistent domain object.

// lightweight -> minimum configuration ,
// minimum impact -> kod degisikligi yaptigimizda minium etki , daha az bagimli olmasi.
// (bu kavrami spring icin de gorebiliriz)

//dasdasd


