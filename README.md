# Programski jezici 2

## DiamondCircle

Igra se odvija na matrici minimalnih dimenzija 7x7, a maksimalnih 10x10. Igru igraju maksimalno 4 igrača, a minimalno 2. Dimenzije matrice i broj igrača zadaju se prije samog pokretanja aplikacije. Potrebno je izvršiti validaciju korisničkog unosa.
Svaki igrač ima ime (koje mora biti jedinstveno) i posjeduje četiri figure iste boje. Svaku od
figura karakteriše boja i način kretanja. Postoje tri vrste figura: obična figura, lebdeća figura i
super brza figura. Svaka od figura može da bude crvene, zelene, plave ili žute boje. Obična
figura prelazi zadati broj polja, kao i lebdeća figura. Super brza figura prelazi duplo više od
zadatog broja polja. Obična i super brza figura mogu da upadnu u rupu, dok lebdeća ostaje
da lebdi iznad rupe. Na početku igre, svakom igraču se dodaju četiri slučajno izabrane figure
iste boje.
Pored figura koje igrači koriste, postoji i jedna “duh” figura - ona započinje svoje kretanje
kada i prvi igrač i kreće se po putanji “u pozadini” postavljajući bonus polja - dijamante, na
putanju. Postavlja slučajan broj dijamanata u opsegu od 2 do dimenzije matrice, na slučajne
pozicije. Postavljanje se obavlja na svakih 5 sekundi i traje do kraja igre. Kada figura naiđe
na dijamant, ona ga “pokupi” i u nastavku igre, prikilom kretanja, broj polja koja prelazi
uvećava se za broj dijamanata koje je pokupila.
Redoslijed igrača se određuje na slučajan način i igrači igraju potez jedan za drugim. 
Pod potezom se smatra pomjeranje figure za određen broj polja sa pozicije na poziciju. Kod pomjeranja voditi računa da ukoliko
je polje na koje se treba pomjeriti već zauzeto, figura se smješta na sljedeće slobodno polje.
Pomjeranje sa polja na polje treba da traje jednu sekundu. Način kretanja određuje se na
osnovu slučajno odabrane karte iz špila od 52 karte. Postoji obična karta i specijalna karta.
Obična karta se sastoji od slike i broja polja koje je figura prelazi. Specijalna karta na sebi
ima samo sliku. Kada se izvuče specijalna karta, na n mjesta na putanji kreiraju se rupe.
Rupe su crne boje. Karta se nakon izvlačenja ponovo vraća u špil. Pod izvlačenjem se
smatra iscrtavanje karte na GUI. Ukoliko se neka figura nalazi na rupi, a nije u pitanju
lebdeća figura, ona propada. Kada neka figura propadne, ukoliko igrač ima još figura, kreće
sa novom od početka. Igra završava kada svi igrači ostanu bez figura – tj. svaka od figura
igrača je došla do cilja (polje 25 na primjeru) ili su svi propali. Za svaku figuru pamtiti
informaciju o pređenim poljima, kao i o vremenu kretanja. Prilikom prikaza figure na polju
potrebno je da na određen način i boja i tip figure budu vidljivi. Igra može da se zaustavi i
pokrene ponovo. Igra se odvija automatski. Na kraju igre se čuvaju rezultati u tekstualnim
fajlovima imenovanim kao IGRA_trenutno_vrijeme.txt.
Klikom na dugme “Prikaz liste fajlova sa rezultatima” otvara se nova forma u kojoj se
tabelarno prikazuje lista fajlova. Klikom na određeni fajl, na proizvoljan način korisniku se
prikazuje njegov sadržaj.
“Vrijeme trajanja igre”, kao i “Opis značenja karte” se osvježavaju svake sekunde. Broj
kvadrata na karti predstavlja broj polja koje figura treba da pređe. Na centralnoj matrici u
sredini prikazuje se kretanje.
