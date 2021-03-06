import java.io.*;
import groovy.io.*;

@NonCPS
def call(Map config=[:]){
    def currentdirectory = new File(pwd());

    new File(currentdirectory.path+'/testoutput.txt').withWriter('utf-8')
    {
        writer ->
          currentdirectory.eachFileRecurse(FileType.ANY) {
              file -> 
              if (!file.isDirectory()) {
                  writer.writeLine(file.name + '\t'+ file.length())
              }
          }
    }
}