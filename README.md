STADOCWEB - RESTful API

Servizi per la gestione dei soggetti del sistema TAU.



### Architettura STADOCWEB

Descrizione dei moduli o tiers:

- **ear**: modulo che gestire il packaging delle APIs
- **api**: modulo che ospita i controller RESTful
- **business**: modulo che implementa la logica di business degli use-cases e le logiche di mapping from/to DTO 
- **integration**: modulo delegato all'integrazione con componenti esterne DB
- **util**: modulo che contiene classi di utility come costanti, parser JSON o XML
- **dto**: modulo che contiene classi di utility come costanti, parser JSON o XML


#### Database

##### DEV

XXX

##### TEST

XXX


### Requisiti ambiente di sviluppo

- OpenJDK 11
- Apache Maven 3.5.4 o superiore
- Wildfly 23 CSI

### Configurazione mirror maven

Il repository Maven CSI è [repart.csi.it/artifactory/maven2](http://repart.csi.it/artifactory/maven2/)

``` 
<mirror> 
    <id>csi-central</id> 
    <name>CSI Repart</name> 
	<url>http://repart.csi.it/maven2</url> 
	<mirrorOf>*</mirrorOf> 
 </mirror>
```

### Definizione e Creazione dei servizi REST

I nuovi servizi vanno prima definiti in formato `yaml` nel file `stacoresrv-1.0.0-swagger.yaml` e successivamente
tramite l'utilizzo degli scripts:

`_gen_swagger.sh`

vengono generate le classi Java con tanto di annotation Swagger e Java Bean.


`_change_version.sh`

poi aggiornare la versione del .tar all'interno del pom padre, in particolare
va cambiata la properties:

`<ear.version>x.x.x</ear.version>`

### Ambienti

Per la fase di sviluppo vi è l'ambiente DEV mentre ad ogni rilascio ufficiale
le API sono versionate, viene creato un nuovo tag avente la seguente nomenclatura:

`TEST-<major>.<minor>.<patch>-<revision>`

a valle della creazione del tag le API sono dispiegate in ambiente di TEST tramite l'ausilio di
strumenti di continuous integration:

- Jenkins
- ADA

la stessa modalità è utilizzate per dispiegare le API in ambiente di COLLAUDO e PRODUZIONE.

#### Ambiente di DEV

Abbiamo disponibile il seguente application server Wildfly:

host: dev-wldsta01.csi.it

partizione: part088stacoresvnode01	

username/pwd: dev-wildfly-088 / mypass	

Console: http://dev-wldsta01.csi.it:18800	  admin / mypass	 

RAM: 1024	

portAJP = 18814
portHTTP = 18810


http://dev-wldsta01.csi.it:18800/stacoresrv


TEST RESOURCES:

http://dev-wldsta01.csi.it:18800/stacoresrv/api/test/resources



#### Ambiente di TEST


ocation apache:  http://tst-applogic.reteunitaria.piemonte.it/stacoresrv



### File properties

Per ogni ambiente in cui le API possono essere dispiegate, all'interno della directory
[stawap-web/buildfiles](stawap-web/buildfiles) troviamo un file `.properties`:

- dev-rp-01
- tst-rp-01
- coll-rp-01
- prod-rp-01

al loro interno vi sono i puntamenti verso le componenti esterne di cui STACORESRV usufruisce.

### Datasource




Il datasource è configurato nello standalone.xml per cui non deve essere deployato come file ma configurato su jboss.
In ambiente di dev deve essere configurato via console, mutuando la configurazione dall'ambiente di test.



### Script SQL



### Nuovi Ambienti Oracle 19


#### Ambiente di sviluppo

jdbc:oracle:thin:@dev-bollo-odb01.csi.it:1521:BOL19SPDB

tau_rw/mypass


#### Ambiente di test

HOST/PORT/SID

jdbc:oracle:thin:@tst-bollo-odb01.csi.it:1521:BOL19TPDB

tau_rw/mypass

# Diagrammi architetturali


## Dagrammi architetturali Esenzioni


![Architettura ESENZIONI](docs/architettura/ComponentDiagram Nuovo BO Esenzioni.jpg)


## Dagrammi architetturali Rimborsi

![Architettura RIMBORSI](docs/architettura/ComponentDiagram Nuovo BO Esenzioni.jpg)




### RIFERIMENTI AMBIENTI VECCHI BACK OFFICE RIMBOSTI/ESENZIONI


Le due applicazioni di back office sono innestate in un insieme di componenti di back office che viene definito come "gestionale".
Per accedere alle due componenti è necessario collegarsi al seguente indirizzo 

https://tst-portale.ruparpiemonte.it/tributi/tassaAuto/sta/stagesonjb

Entry point appartenente alla componente stageson

Le due componenti oggetto di reignerizzazione sono le componenti afferenti ai due link di testata:

esenzioni => staeseon
rimborsi  = starimon


Quindi nel sistema di back office attuale l'accesso non avviene direttamente sull'applicativo (esenzioni o rimborsi) ma passando dalla componente di entry point stageson.

Di seguito i riferimenti delle due applicazioni


## ESENZIONI

Prodotto STAREG

Le componenti coinvolte sono:


staeseon: componente di front end realizzata coon struts 1.2
staesesrv: componente a servizi esposto con EJB session stateless 2.1 wrappata con soluzione interna CSI PA/PD


Ambienti di test:

jboss 4.3 jdk 1.5

tst-jbsta01.csi.it/tst-jbsta02.csi.it

user: tst-jboss439-108
pwd: mypass

# git

https://gitlab.csi.it/prodotti/stareg/staeseon
https://gitlab.csi.it/prodotti/stareg/staesesrv


## RIMBORSI

Prodotto STAREG

Le componenti coinvolte sono:

starimon: componente di front end realizzata coon struts 1.2
La logica che deve essere riscritta sulla componente di bl si trova nell'interfaccia ServizioRimborsiInterface di staon





Ambienti di test:

jboss 4.3 jdk 1.5

tst-jbsta01.csi.it/tst-jbsta02.csi.it

user: tst-jboss439-108
pwd: mypass

# git

https://gitlab.csi.it/prodotti/stareg/starimon

# SVN

http://subversion.csi.it:10090/dsp/stacore/staon/

(a breve il porting su repo GIT)



# SERVIZIO DI CALLBACK  

Una volta realizzato il servizio di callback da STARDAS, occorre chiamare il servizio che implementa il CdU di completamento dell'operazione di protocollazione aeffettuato precedentemente con al protocollazione sincrona.

Occorre quindi per ogni tipologia di documento realizzare il servizio che andrà ad aggiornare l'id documento associato all'entità oggetto di protocollazione.





Vediamo per ogni tipologia di documento quale servizio implemtare e chiamare


## Osservazione su avviso di scadenza GOSS_MOD


Per questo tipo di documento (Inserito dalla PWA) attualmente, quando viene insweirta una comunicazione utente,
viene chiamata:

1. la protocollazione sincrona

2. il servizio di inserimento di una comunicazione utente (STAON)


L'oggetto comunicazione utente contiene gli attributi

comunicazioneUtente.setIdentificativoProtocollazione(response.getProtocollo());
comunicazioneUtente.setIdentificativoArchivio(response.getIdDocumento());
 
che sono il numero di protocollo e id documento precedentemente staccati 
 
 staonComunicazioneFacade.inserisciComunicazione  (comunicazioneUtente, "STAPOC_OSS");


Infine viene inviata una mail


La soluzione asincrona prevede:


1. modificare(creare una nuova versione del servizio di inserimento comunicazione utente implementato su stacomutserv che non gestirà più il protocolla ma la prenotazione 
2. utilizzare il nuovo servizio di stacomutsrv sulla stawapp.

3 scrivere un nuovo servizio su stacomutsrv che valorizza l'id documento dell'entità comunicazione associata alla prenotazione staccata. 





















