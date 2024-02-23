importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
    Sistema . fora . println ( "Digite um número:" );
    int  numero = scanner . próximoInt ();
     fatorial longo = 1 ;
    for ( int  i = 1 ; i <= número ; i ++){
        fatorial *= i ;
    }
    Sistema . fora . println ( "O fatorial de " + numero + " é " + fatorial + "." );
    }
}
