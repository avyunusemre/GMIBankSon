@US_01(Negative)
  Feature: Sistem, herhangi bir kullanıcının geçerli kimlik bilgileriyle kaydolmasına izin vermelidir
    Background:Kullanici bir user olarak gmibank anasayfasina gider
      Given Kullanici bir user olarak gmibank anasayfasina gider
      And Kullanici bir user olarak sag ust kosede bulunan insan simgesine tiklar
      And Kullanici bir user olarak acilan menuden register linkine tiklar

    @TC_0102
    Scenario: TC_0102 SSN numarasinin yanlis girildiginde hata mesaji almak
      Given Kullanici bir user olarak SSN textboxina gecersiz  "333-22-443" numarasini girer
      Then Kullanici bir user olarak "Your SSN is invalid" hata mesajini goruntuler

    @TC_0103

    Scenario: TC_0103 bos first name negative test
      Given Kullanici bir user olarak First Name textboxini "" bos birakir
      Then Kullanici bir user olarak "Your First Name is required" hata uyarisini goruntuler

    @TC_0104
    Scenario: TC_0104 bos last name negative test
      Given Kullanici bir user olarak Last Name textboxini "" bos birakir
      Then Kullanici bir user olarak "Your Last Name is required" Lastname hata mesajini goruntuler

    @TC_0105
    Scenario: TC_0105 gecersiz mobile phone number negative test
      Given Kullanici bir user olarak Mobile Phone Number textboxina tire olmadan "1231231234" cep telefonu numarasini girer
      Then Kullanici bir user olarak "Your mobile phone number is invalid" hata mesajini goruntuler

    @TC_0106
    Scenario: TC_0106 gecersiz kullanici adi test
      Given Kullanici bir user olarak Username textboxina  sadece sayilardan olusan "123" kullanici adini girer
      Then Kullanici bir user olarak Username textboxinin cerceve renginin kirmizi oldugunu goruntuler

    @TC_0107
    Scenario: TC_0107 "Herhangi bir alan bos birakildiginda hata mesaji alindigini goruntulemek"

      Given Kullanici bir user olarak SSN textboxina "460-63-5329" numarasini girer
      And Kullanici bir user olarak First Name textboxina "Ahmet" ismini girer
      And Kullanici bir user olarak Last Name textboxina "Ayvaz" soyismini girer
      And Kullanici bir user olarak Address textboxina "A mah. B cad. No:1 66300 Istanbul Sariyer"  adresini girer
      And Kullanici bir user olarak Mobile Phone Number textboxina "123-123-1234" cep telefonu numarasini girer
      And Kullanici bir user olarak Username textboxina  "AAbc123" kullanici adini girer
      And Kullanici bir user olarak Email textboxina herhangi bir deger girmez
      And Kullanici bir user olarak New password textboxina "A1b2C3" sifresini girer
      And Kullanici bir user olarak New password confirmation textboxina "A1b2C3" sifresini girer
      And Kullanici bir user olarak Register butonuna tiklar
      Then Kullanici Your email is required mesajini goruntuler





















