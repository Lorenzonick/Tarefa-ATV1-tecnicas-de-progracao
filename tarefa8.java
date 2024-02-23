importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
        Sistema . fora . println ( "Digite um número inteiro:" );
        int  n = scanner . próximoInt ();
        int  soma = 0 ;
         número interno = 1 ;

        for ( int  i = 0 ; i < n ; i ++) {
            soma += numero ;
            número += 2 ;
        }

        Sistema . fora . println ( "A soma dos primeiros " + n + " números ímpares é: " + soma );
    }
}