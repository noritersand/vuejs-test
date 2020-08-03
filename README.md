# vuejs with spring

vuejs 프레임웤 테스트용 프로젝트. 서버 사이드는 spring. ~~띠용용용~~

#### environments

- jdk 10 or higher
- maven
- spring 5.2.4(java config base)
- tomcat 9
- vuejs.js

## 코딩 가이드

### example

#### 파일 읽어서 json으로 응답

```java
@GetMapping(path = "/vuejs/readSample", produces = "application/json")
public Map<String, Object> readSample(HttpServletResponse resp) throws IOException {
	HashMap<String, Object> json = jsonConverter.readValue(new ClassPathResource("data/sample.json").getFile(), 
			new TypeReference<HashMap<String, Object>>() {});
	logger.debug("{}", json);
	return json;
}
```

#### vuejs/test.jsp 응답

```java
@GetMapping("/vuejs/test")
public ModelAndView test(ModelAndView model) {
	return model;
}
```