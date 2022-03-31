def systemout = new StringBuffer(), systemerr = new StringBuffer()

def proc ='./script.sh'.execute()

proc.consumeProcessOutput(systemout, systemerr)
proc.waitForProcessOutput()
println systemout
