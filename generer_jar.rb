# Compiler les classes dans un jar pour utilisation comme librairie
File.unlink("brumes_network.jar") if File.exist?("brumes_network.jar")
fork { exec('javac -d bin src/fr/gembasher/brumes/network/*.java') }
Process.waitall
Dir.chdir("./bin")
exec ('jar cf ../brumes_network.jar fr/gembasher/brumes/network/*')
