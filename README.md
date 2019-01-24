Koristenjem IntelliJ i Selenium Webdrivera kreirano je 6 testova s različitim funkcionalnostima

Nacin izrade projekta :  Intellij->Maven, uredivanje pom.xml datoteke. Nakon sto je IntelliJ dovrsio postavljanje, dodamo Java klasu i pišemo testove.

Izrađeni testovi :

signInSQLInject - logiranje pokušajem SQL Injectiona s validnim e-mailom  
signInPasswordNone - logiranje bez utipkavanja passworda  
signInValid - provjera logiranja s postojecim racunom  
signOut - odjavljivanje  
signUp - kreiranje novog računa  
passwordLessThan8 - duljina sifre manja od 8  
