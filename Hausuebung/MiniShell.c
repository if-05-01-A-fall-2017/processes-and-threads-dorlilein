#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(int argc, char const *argv[]) {
  printf("Dorli's-MacBook: ");
  char* command[15];
  scanf("%s",*command );
  int status;
  char* args[15];
  args[0] = *command;
  int argcount = 1;
  printf("%s\n",args[0] );
  for(int i = 0; i < strlen(*command);i++)
  {
    if(i == ' ')
    {
      args[argcount] = *(command+i);
      argcount++;
    }
    if(i == '&')
    {
    if(fork() != 0)
    {
      waitpid(-1, &status,0);
    }else{
      execvp(args[0],args);
    }

  }
}

  return 0;
}
