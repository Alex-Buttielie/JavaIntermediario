package aula65;

@interface InformacaoAula {

    String autor();
    String blog () default "http://loiane.com";
    String site() default "http://loiane.training";
    int aulaNumero();
}
