importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
        Sistema . fora . println ( "Digite um número:" );
        int  numero = scanner . próximoInt ();
        if ( número > 0 ){
            Sistema . fora . println ( "Número positivo!" );
        } outro {
            Sistema . fora . println ( "Número negativo!" );
        }
    }
}