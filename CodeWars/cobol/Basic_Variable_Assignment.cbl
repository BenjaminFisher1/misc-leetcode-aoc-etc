       IDENTIFICATION DIVISION.
       PROGRAM-ID. KATA.
       DATA DIVISION.
       LINKAGE SECTION.
       01 A           PIC X(4).
       01 B           PIC X(5).
       01 NAME        PIC X(9).
       PROCEDURE DIVISION USING A B NAME.
          MOVE "code" TO A.
          MOVE "wa.rs" TO B.
          STRING A DELIMITED BY SIZE
                 B DELIMITED BY SIZE
            INTO NAME
          END-STRING.
          goback.
       END PROGRAM KATA. 