importar  java . útil . Scanner ;
importar  java . útil . ListaArray ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
        ArrayList < String > nomes = new  ArrayList < String >();

        para ( int  eu = 0 ; eu < 5 ; eu ++) {
            Sistema . fora . println ( "Digite o nome " + ( i + 1 ) + ":" );
            nomes . adicionar ( scanner.nextLine ( )) ;
        }

        Sistema . fora . println ( "Digite outro nome: " );
        String  outroNome = scanner . próximaLinha ();

        if ( nomes . contém ( outroNome )) {
            Sistema . fora . println ( "O nome " + outroNome + "está na lista!" );
        } outro {
            Sistema . fora . println ( "O nome " + outroNome + " não está na lista." );
        }
    }
}
