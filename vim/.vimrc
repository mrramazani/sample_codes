let &titleold=getcwd() " prevents VIM from setting the title of terminal to "Thanks for flying VIM"
let g:neocomplcache_enable_at_startup = 1
let g:scala_sort_across_groups=1
let g:scala_first_party_namespaces='\(controllers\|views\|models\|util\|de.\)'
execute pathogen#infect()
syntax on
filetype plugin indent on
set autoindent
set hlsearch
set wrap
set nolist
set ignorecase
set nu
set mouse=a
set ts=4
set shiftwidth=4
set title
set laststatus=2
colorscheme koehler
set tags+=/usr/include/wx-2.8/tags
"set tags+="/usr/src/linux-headers-`uname -r`/tags"
"set tags+=/usr/local/include/tags
"set tags+=/usr/include/tags
"set tags+=/root/hamid_ramazani/PF_RING-6.0.1/tags
"set tags+=/usr/lib/gcc/x86_64-linux-gnu/4.8.2/tags
map <F7> mmgg=G`m

"open the definition in a new windows
map <C-\> :tab split<CR>:exec("tag ".expand("<cword>"))<CR>
""open the definition in a vertical split
"map <A-]> :vsp <CR>:exec("tag ".expand("<cword>"))<CR>


if has('gui')
  set guioptions-=e
endif
if exists("+showtabline")
  function MyTabLine()
    let s = ''
    let t = tabpagenr()
    let i = 1
    while i <= tabpagenr('$')
      let buflist = tabpagebuflist(i)
      let winnr = tabpagewinnr(i)
      let s .= '%' . i . 'T'
      let s .= (i == t ? '%1*' : '%2*')
      let s .= ' '
      let s .= i . ':'
      let s .= winnr . '/' . tabpagewinnr(i,'$')
      let s .= ' %*'
      let s .= (i == t ? '%#TabLineSel#' : '%#TabLine#')
      let bufnr = buflist[winnr - 1]
      let file = bufname(bufnr)
      let buftype = getbufvar(bufnr, 'buftype')
      if buftype == 'nofile'
        if file =~ '\/.'
          let file = substitute(file, '.*\/\ze.', '', '')
        endif
      else
        let file = fnamemodify(file, ':p:t')
      endif
      if file == ''
        let file = '[No Name]'
      endif
      let s .= file
      let i = i + 1
    endwhile
    let s .= '%T%#TabLineFill#%='
    let s .= (tabpagenr('$') > 1 ? '%999XX' : 'X')
    return s
  endfunction
  set stal=2
  set tabline=%!MyTabLine()
  map    <C-Tab>    :tabnext<CR>
  imap   <C-Tab>    <C-O>:tabnext<CR>
  map    <C-S-Tab>  :tabprev<CR>
  imap   <C-S-Tab>  <C-O>:tabprev<CR>
endif


"" setup
"if has("cscope")
"    set csto=0                                                                             
"    set cst
"    set nocsverb
"    " add any database in current directory
"    if filereadable("cscope.out")
"    cs add cscope.out
"    " else add database pointed to by environment
"    elseif $CSCOPE_DB != ""
"    cs add $CSCOPE_DB
"    endif
"    set csverb
"endif
"
"" jump to a function declaration
"nmap <silent> <C-\> :cs find s <C-R>=expand("<cword>")<CR><CR>1<CR><CR>
"" show a list of where function is called
"nmap <silent> <C-_> :cs find c <C-R>=expand("<cword>")<CR><CR>

