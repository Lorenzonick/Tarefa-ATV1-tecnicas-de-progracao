importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );

        Sistema . fora . println ( "Escolha uma opção:" );
        Sistema . fora . println ( "1. Calcular área do quadrado" );
        Sistema . fora . println ( "2. Calcular área do círculo" );

        int  opcao = scanner . próximoInt ();

        switch ( opção ) {
            caso  1 :
                Sistema . fora . println ( "Digite o lado do quadrado:" );
                 lado duplo = scanner . próximoDuplo ();
                 área duplaQuadrado = lado * lado ;
                Sistema . fora . println ( "A área do quadrado e: " + areaQuadrado );
                quebrar ;
            caso  2 :
                Sistema . fora . println ( "Digite o raio do círculo:" );
                 raio duplo = scanner . próximoDuplo ();
                 área duplaCirculo = Math . PI * raio * raio ;
                Sistema . fora . println ( "A área do círculo e: " + areaCirculo );
                quebrar ;
            padrão :
                Sistema . fora . println ( "Opção inválida." );
                quebrar ;
        }
    }
}
