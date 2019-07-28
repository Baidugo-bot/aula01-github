package main;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Bom dia");
          //para salvar basta digitar em sequencia
          //git add . para enviar os arquivos para o stage(pre-commit)
          //git commit -m "Texto explicativo" para salvar em commit(local)
          //git push para salvar no git
          //IMPORANTE, ANTES DE SALVAR, E DE EXTREMA IMPORTANCIA QUE
          //o seu repositorio commit esteja atualizado com o ultimo do git hub
          
         System.out.println("Boa tarde");
         
         System.out.println("Boa noite");
          
                
       // KIT DE PRIMEIROS SOCORROS GIT
          //Quero desfazer tudo que eu fiz desde o último commit git clean -df
          
          //git checkout -- .

          //Preciso remover o último commit, porém mantendo os
          //arquivos do jeito que estão. 
          //git reset --soft HEAD~1
         
          //Preciso remover o último commit, inclusive as
          //alterações nos arquivos. 
          //git reset --hard HEAD~1
          
          //Quero alterar temporariamente os arquivos do projeto
          
          //de modo a ficarem no estado do commit informado.
         
          //ATENÇÃO: não podem haver modificações não
          //commitadas no projeto.
          //NOTA: para voltar ao último commit faça:
          //git checkout master
          
          //git checkout <código do commit>
          
          //EXEMPLO: git checkout e8a52f3
          
          //Preciso apagar o último commit no Github 
          //git push -f origin HEAD^:master

          //Quero mudar o meu repositório remoto "origin" 
          //git remote set-url origin https://github.com/acenelio/novoprojeto.git
          
          //Entrei no VIM por engano. Como sair? 
          //Tecle ESC, depois digite :q! e tecle ENTER
          


	}

}
