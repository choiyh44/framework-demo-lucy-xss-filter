# framework-demo-lucy-xss-filter
## lucy-xss-servlet-filter 적용방법
1. pom.xml에 lucy-xss-servlet 디펜던시 추가한다.
2. @Configuration을 작성하여 lucy xss servlet filter bean을 등록한다.
3. resources 폴더 아리에 lucy-xss-servlet-filter-rule.xml 설정파일을 생성한 후 필터링 대상 URL및 파라미터들에 대한 커스터마이징을 수행한다.
