import sys
import os
import re
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

if len(sys.argv) < 2:
	print("error: run-compile.py <projects-file>")
	print("Example: run-compile.py ")
	sys.exit(1)

project_files = sys.argv[1]

dados = open(project_files, 'r')
for x in dados:
	x = x.strip()
	info = x.split(':')
	prj = info[0]
	clazz = info[1]
	cmd = "cd " + prj + "; mvn clean compile test-compile"
	os.system(cmd)

dados.close()
