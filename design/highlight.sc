

######### COMMENTS #########

#
# Single-Line comments are made with the hash
#

#*
    #*
        Multiline comments are started with the hash and asterisk and closed in reversed order.
    *#

    Comments opened inside other comments need to be closed, too.

*#

######### STRINGS #########

"Strings can be opened/closed with double quotation marks or"
'single quotation marks. Escaping them \' works as flawless.'
`Template strings $(are) included.`

######### NUMERICS #########

-100.00
-.5
.00

######### VARIABLE COLORING #########

# Variables need to start with a letter or underscore,
# can follow with letters, underscore and numbers.
abcdef012345, _____hello_world

# All variables starting with uppercase letters are
# usually types (but not hardcoded)
Abcdef012345, _____HelloWorld

# Non-Type Variables followed by brackets are usually functions

hello ()

######### RESERVED TYPES #########

any, uint64, int, int32, str, bool, byte, func, code

######### RESERVED CONTROL KEYWORDS #########

mtd, attr, op, fn, comp, scope, struct, ext, do, exit, return, next, if, for, loop, throw, use

######### RESERVED KEYWORDS #########

pub, self, with, in, to, query, true, false, be, new

######### RESERVED METHODS (= KEYWORDS) #########

del, out, sleep, abort

######### RESERVED CONSTANTS #########

window, document, process

######### ATTRIBUTES #########

@hello.world
$attributiveKeywords