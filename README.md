# spring_boot

Please use following content as manifest.yml while deploying the jar

---
applications:

- name: demo-0
  memory: 1024M
  path: demo-0.0.1-SNAPSHOT.jar
  buildpacks:
    - sap_java_buildpack
  env:
    TARGET_RUNTIME: tomee7
    SPRING_PROFILES_DEFAULT: cf
   
