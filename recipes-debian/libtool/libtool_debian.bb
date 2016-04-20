#
# base recipe: meta/recipes-devtools/libtool/libtool_2.4.2.bb
# base branch: daisy
#

PR = "${INC_PR}.0"

inherit debian-package

require libtool.inc

#                                                                               
# We want the results of libtool-cross preserved - don't stage anything ourselves.
#                                                                               
SYSROOT_PREPROCESS_FUNCS += "libtool_sysroot_preprocess"                        
                                                                                
libtool_sysroot_preprocess () {                                                 
        rm -rf ${SYSROOT_DESTDIR}${bindir}/*                                    
        rm -rf ${SYSROOT_DESTDIR}${datadir}/aclocal/*                           
        rm -rf ${SYSROOT_DESTDIR}${datadir}/libtool/config/*                    
} 
SRCREV = "49abf1fe2200b9338e2f3d6168be4804db950f14"
