importar  java . útil . Scanner ;

 classe  pública Principal {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = novo  Scanner ( System . in );
        String  senhaSecreta = "Java123" ;
         Tentativa de cordas ;

        enquanto ( verdadeiro ){
            Sistema . fora . println ( "Digite a senha: " );
            tentativa =   scanner . próximaLinha ();

            if ( tentativa . equals ( senhaSecreta )){
                Sistema . fora . println ( "Acesso concedido!" );
                quebrar ;
            } outro {
                Sistema . fora . println ( "Tentativa inválida, tente novamente." );
            }
        }
    }
}