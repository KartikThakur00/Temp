Feature: Check all Header Links are working

  Scenario Outline: Hovering and clicking on header links
    Given We are on Xenonstack Website
    When Hover On "<Header>"
    When Click the on "<Link>"
    Then Cross check with "<Page Title>"

    Examples:
      | Header | Link | Page Title |
      |        |      |            |