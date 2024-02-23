importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
    Sistema . fora . println ( "Digite sua idade: " );
    int  idade = scanner . próximoInt ();
    if ( idade < 18 ){
        Sistema . fora . println ( "Você é menor de idade" );
    } else  if ( idade < 60 ){
        Sistema . fora . println ( "Você é adulto" );
    } outro {
        Sistema . fora . println ( "Você é idoso" );
    }
    }
}
