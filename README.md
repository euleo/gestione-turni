# gestione-turni

**Database**

MySQL

Creare un database chiamato turniDB 

Inserire le credenziali di mysql nel file src/main/resources/application.properties


**Esempi di chiamate**

Aggiungere un autista http://localhost:8080/api/autista

Body raw

{
	"nome" : "Myname",
	"cognome" : "Mysurname"
}

Aggiungere un nuovo turno http://localhost:8080/api/turni

Body raw

{
    "giorni": [
        "2020-11-04",
        "2020-11-05"
    ],
	"luogoInizio" : "Firenze",
	"luogoFine" : "Calenzano",
	"lunghezza" : 10,
    "durata" : 120,
    "ora_inizio": "08:00:00",
    "ora_fine": "14:00:00",
    "autista": {
    "id": 1
    }
}

Rimuovere un turno http://localhost:8080/api/turni/{id_turno}

Rimuovere tutti i turni dato un autista http://localhost:8080/api/turni/autista/{id_autista}
