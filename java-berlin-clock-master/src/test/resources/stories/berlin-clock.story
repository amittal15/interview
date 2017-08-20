Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO
Then hour clock should look like
OOOO
OOOO
Then minute clock should look like
OOOOOOOOOOO
OOOO
Then second clock should look like
Y

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO
Then hour clock should look like
RROO
RRRO
Then minute clock should look like
YYROOOOOOOO
YYOO
Then second clock should look like
O

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY
Then hour clock should look like
RRRR
RRRO
Then minute clock should look like
YYRYYRYYRYY
YYYY
Then second clock should look like
O

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO
Then hour clock should look like
RRRR
RRRR
Then minute clock should look like
OOOOOOOOOOO
OOOO
Then second clock should look like
Y




