# Java-1-Associate-CourseExam-RO
Project build for the final exam of the JAVA 1A course. Note: RO version.

Într-o instituție se oferă două tipuri de cursuri: cursuri de programare și cursuri de limbi străine.
Orice curs are un id, o denumire și un preț. Id-ul este un număr care corespunde numărului de ordine al
cursului adăugat.

Instituția poate oferi maxim 30 de cursuri (de programare și de limbi straine) și are următoarele
comportamente:
- adaugăCurs – care adaugă un nou curs în oferta de cursuri (daca mai exista spatiu, în caz contrar
se va arunca o excepție de tipul PreaMulteCursuriException – definită de programator);
- afișeazăCursuri – afișează toată oferta de cursuri disponibile (cu toate detaliile acestora);
- afișeazăCursuriProgramare – afișeaza doar cursurile de programare disponibile (cu toate
caracteristicile acestora);
- stergeCurs – sterge un curs identificat prin id-ul primit ca parametru.

Aplicația primește următoarele comenzi din consolă și lucrează cu o singură instituție:
- exit – închide aplicația;
- adauga_curs <tip> <denumire> <preț> - adaugă un curs de tipul corespunzător în oferta
instituției;
- afișare – afișează toate cursurile din instituție;
- afisare_cursuri_programare – afișează toate cursurile de programare disponibile;
- șterge_curs <id_curs> - sterge cursul al cărui id este trimis ca parametru.
- În background va rula un fir de execuție care va afișa numărul total de cursuri. Acest thread se
va actualiza o dată la 2 minute.
