package com.yadevom.usoEnum;

enum DiaDeLaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

// Vamos a darle un ranking y tambien anexaremos un evento
public enum EnumDiaDeLaSemana {

    LUNES(10, "fubtol"), MARTES(50, "voleibol"), MIERCOLES(60, "gimnasio"), JUEVES(70, "catedra"), VIERNES(80, "fiesta"), SABADO(90, "asado"), DOMINGO(100, "ninguno");

    // Extendiendo el Enum
    final int ranking;
    // Vamos a definir mas tipos de variables
    final String evento;

    EnumDiaDeLaSemana(int ranking, String evento) {
        this.ranking = ranking;
        this.evento = evento;
    }
}
