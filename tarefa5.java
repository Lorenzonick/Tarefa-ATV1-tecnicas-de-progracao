importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
    Sistema . fora . println ( "Digite um número inteiro:" );
    int  numero = scanner . próximoInt ();
    if ( número % 2 == 0 ){
        Sistema . fora . println ( "O número é par." );
    } outro {
        Sistema . fora . println ( "O número é impar." );
     }
    }
}
