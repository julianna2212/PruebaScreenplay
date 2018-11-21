#Author: juliana.garcia
@search
Feature: elempleo search job
  I want search a job into el empleo web site

  @smokeTest
  Scenario: search a job
    Given that Pepito is in the search el empleo page
    When he enter the job he wants
      | job          | city                |
      | Confecciones | Medellín, Antioquia |
    Then he should see the jobs he wants
