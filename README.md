# Chat Application UDP

Questo progetto è un'applicazione di chat che consente a due utenti di comunicare tramite una connessione UDP.

## Struttura del progetto

Il progetto è suddiviso in due parti principali:

### Server UDP:

- `UDPServer`: Rappresenta il server della chat che rimane in ascolto sulla porta specificata e gestisce la comunicazione con i client tramite UDP.

### Client UDP:

- `UDPClient`: Rappresenta il client della chat che invia e riceve messaggi dal server tramite UDP.

## Utilizzo

Per avviare la chat:

1. Avvia il server eseguendo la classe `UDPServer`.
2. Avvia due istanze del client eseguendo la classe `UDPClient`. Puoi farlo in due finestre del terminale o in due IDE separati.
3. Una volta che il client e il server sono in esecuzione, i due utenti possono digitare e inviare messaggi tra loro.

### Nota:

- Entrambi il client e il server possono essere eseguiti sulla stessa macchina o su macchine diverse all'interno della stessa rete.
- Per terminare la chat, digita "exit" nella cons
