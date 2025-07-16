# Android Playground App

App para testes dos componentes Android usando Kotlin

## Ferramentas Utilizadas
- Kotlin com Gradle
- Componentes feitos com Jetpack Compose

## Problemas
Aqui serão escritos os problemas encontrados durante o desenvolvimento do app, na visão de uma pessoa que está iniciando o desenv. em Kotlin e Android, e as possíveis correções

### 1. Alteração do sdk.dir no [local.properties](local.properties)
Ao mudar de S.O., este path tem que mudar também. Como ele precisa ser incluído no repositório, ele sempre estará indicado como modificado pelo GIT. Não sei se tem alguma forma de deixar ele como readonly para o GIT.